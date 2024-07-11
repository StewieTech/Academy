package Compiler;

import javafx.application.Application ;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javafx.stage.FileChooser;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * JavaFX handles Browsing for Files and Saving Outputs
 * <<a href="https://openjfx.io/javadoc/18/javafx.graphics/javafx/application/Application.html#launch(java.lang.String...)">JavaFX Application"</a>>
 *
 */
public class UI extends Application {
  private static String codeSource = "";
  private static  Scanner scanner = new Scanner(System.in);
  private static boolean isFileLoaded = false;
  private static final Object fileLoadMutex = new Object();
  private static final StringBuilder userLog = new StringBuilder();
  private static Stage lexStage;
  private static final FunFactsManager funFactsManager = new FunFactsManager();
  private static Timer funFactsTimer = new Timer();

  /**
   * <h1>UI.java Controls all the main UI functionality</h1>
   * ~~~
   * <h3>To Start the Lexical Analyzer, run GUIStarter.java </h3>
   * <p> The idea is users will be printed console menus which they will select from. <br>
   * Introducing JavaFX means that some multithreading behaviour handling needed to be added.
   * As I have two different JavaFX stages that may not be run by the user, creating startJavaFX was crucial to encapsulate the starting behaviour. This ensured that if I am using JavaFX, it is run for sure.
   * I decided to create a small main function and run the methods from here to have better control of ensuring JavaFX has been initialized </p>
   *
   */


  public static void main(String[] args) {
    startJavaFX.initialize();
    runMainCode();
  }


  public static void runMainCode() {

    int userChoice;
    int saveUserChoice ;

    do {
      Printer.displayInitialMenu();
      userChoice = scanner.nextInt();
      userLog.append("Initial Menu selected: ").append(userChoice).append("\n");

      switch (userChoice) {
        case 1:
          codeSource = "int x = 43; if (x > 0) { x = x + 1; } \" This is a string \" ";
          System.out.println(codeSource);
        userLog.append("Inputted Code: ").append(codeSource).append("\n");
          break;


        case 2:
          System.out.println("Enter your input/code and turn it into TOKENS :D :");
          scanner.nextLine() ;
          codeSource = scanner.nextLine();
          userLog.append("Inputted Code: ").append(codeSource).append("\n");
          break;

        case 3:
          // By launching JavaFX on a different thread we can ensure safe thread behaviour and avoid exceptions form unpredictability
          // fileLoadMutex is simply an Object, allowing me to use object methods like .wait(). This object waits for notify() within the codeSourceFile method.
          startJavaFX.runLater(() -> codeSourceFile(lexStage));
          // Ensuring that the main thread is waiting until the user has selected a file before continuing
          synchronized (fileLoadMutex) {
            while (!isFileLoaded) {
              try {
                fileLoadMutex.wait();
              } catch (InterruptedException e) {
                e.printStackTrace() ;
              }
            }

          }
          userLog.append("Inputted Code: ").append(codeSource).append("\n");
          break ;

        case 0:
          System.out.println("Thanks for using the Lexical Analyzer!");
          return;

        default:
          System.out.println("Wrong Input!! Please use the correct Input");
          continue;
      }
    } while (userChoice < 1 || userChoice > 3);

      // As Printer accepts a lexicalInstance, we initiate a Lexical object to pass into Printer.
      Lexical lexerInstance = new Lexical(codeSource);
      List<Tokens> tokens = lexerInstance.codeToTokens(); // invoking method to turn source code into tokens
      Printer printer = new Printer(lexerInstance);

      Printer.displayCodeSource(codeSource);
      do {
      Printer.displayPrintMenu();
      userChoice = scanner.nextInt();
      userLog.append("Print Menu Option Selected: ").append(userChoice).append("\n");

      switch (userChoice) {
        case 1:
          System.out.println(printer.printTokensList());
          userLog.append("Printed Tokens List. \n");
          userLog.append(printer.printTokensList()).append("\n");
          break;

        case 2:
          System.out.println(printer.printTokensMap());
          userLog.append("Printed Tokens Map \n");
          userLog.append(printer.printTokensMap()).append("\n");
          break;

        case 3:
          System.out.println(printer.printTokenCounts());
          userLog.append("Printed Token Counts \n");
          userLog.append(printer.printTokenCounts()).append("\n");
          break;

        case 9:
          main(new String[1] );
          break;

        case 0:
          System.out.println("Thank You for using the Lexical Analyzer !! :D ");
          return ;

        default:
          System.out.println("Terrible Choice!! Please choose one of the available numbers");
      }
    } while (userChoice < 1 || userChoice > 3); ;

    do {
    Printer.displaySavingMenu();
    saveUserChoice = scanner.nextInt() ;

      switch (saveUserChoice) {
        case 1: // Save's Entire file by exporting what's in userLog to .txt file
          SaveUserFile.saveToFile(userLog.toString());
          System.out.println("Entire File Saved !!");
          break;
        case 2: // Saves the printer's string output
          StringBuilder outputString = new StringBuilder();
          if (userChoice == 1) {
            outputString.append(printer.printTokensList());
          } else if (userChoice == 2) {
            outputString.append(printer.printTokensMap());
          } else {
            outputString.append(printer.printTokenCounts());
          }
          SaveUserFile.saveToFile(outputString.toString());
          break;
        case 9:
          main(new String[1]) ;
          break ;
        case 0:
          System.out.println("Thanks for using the fabulous Lexical Analyzer !! ");
          return ;
        default :
          System.out.println("Horrible Choice! Do Better!! Pick a valid one !!");
      }
    } while (saveUserChoice != 0) ;
      scanner.close();
  }

  // As I extended application, I must implement its abstract method start. Originally had a browse button but decided just to bring up the codeSourceFile window explorer directly
  @Override
  public void start(Stage lexStage) throws Exception {
//    lexStage.setTitle("Lexical Analyzer");
//    Button browseButton = new Button("Browse for Files");
//    browseButton.setOnAction(tmp -> codeSourceFile(lexStage));
//    VBox vbox = new VBox(browseButton);
//    Scene scene = new Scene(vbox, 300, 200);
//    lexStage.setScene(scene);
//    lexStage.show();
  }

  // Case3 calls runLater to start a Java Thread then this function is run.
  public static void codeSourceFile(Stage lexStage) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Select your code file to be Analyzed !! :D");
    fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Files", "*.*"),
            new FileChooser.ExtensionFilter("Java files", "*.java*")
    );

    startFunFacts();
    File fileChosen = fileChooser.showOpenDialog(lexStage);
    stopFunFacts();
    if (fileChosen != null) {
      try {
        codeSource = new String(Files.readAllBytes(fileChosen.toPath()));
        System.out.println("File loaded successfully!!: ");
        System.out.println(codeSource);

        // The main thread can now continue as we have notified it and set are boolean to true
        synchronized (fileLoadMutex) {
          isFileLoaded = true;
          fileLoadMutex.notify();
        }
      } catch (IOException e) {
        System.err.println("File load was unsuccessful :( : "+ e.getMessage());
      }
    } else {
      System.out.println("User Cancelled");
    }
  }

  public static void startFunFacts() {
    System.out.println("\n JavaFX is Open!! In the meantime, See funfacts about Lexical Analyzers below :D \n");
    funFactsTimer = new Timer();
    funFactsTimer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        String funFact = funFactsManager.getRandomFunFact();
        if (funFact != null) {
          System.out.println(funFact);
          userLog.append("Fun Fact: ").append(funFact).append("\n");
        } else {
          funFactsTimer.cancel();
        }
      }
    }, 0, 6000); // Show a fun fact every 6 seconds
  }

  public static void stopFunFacts() {
    if (funFactsTimer != null) {
      funFactsTimer.cancel();
    }
  }

  // Getter methods
  public static String getCodeSource() {
    return codeSource;
  }
  public static void setCodeSource(String codeSource) {
    UI.codeSource = codeSource;
  }

  public static boolean getIsFileLoaded() {
    return isFileLoaded;
  }

  public static Object getFileLoadMutex() {
    return fileLoadMutex ;
  }

  public static StringBuilder getUserLog() {
    return userLog ;
  }

}
