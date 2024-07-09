package Compiler;

// JavaFX handles Browsing for Files and Saving Outputs
// <https://openjfx.io/javadoc/18/javafx.graphics/javafx/application/Application.html#launch(java.lang.String...)>
import javafx.application.Application ;
import javafx.stage.Stage;
//import javafx.application.Platform;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javafx.stage.FileChooser;
//import javafx.stage.FileChooser.ExtensionFilter ;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

// As JavaFX is on a different thread then main we use the library below to handle race conditions and concurrency
// decided just to revert back to using synchronized to handle multithreading
//import java.util.concurrent.CountDownLatch;




import java.util.List;
//import java.util.Map;
import java.util.Scanner;

public class UI extends Application {
    private static String codeSource = "";
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isFileLoaded = false;
//    private static final CountDownLatch latch = new CountDownLatch(2);
  private static final Object fileLoadMutex = new Object();
  private static StringBuilder userLog = new StringBuilder();
  private static Stage lexStage;

  public static void main(String[] args) {
    startJavaFX.initialize();
    runMainCode();
//    launch(args);
  }


  public static void runMainCode() {

    int userChoice;
    int saveUserChoice ;

    do {
      Printer.displayInitialMenu();
      userChoice = scanner.nextInt();
      userLog.append("Initial Menu selected: ").append(userChoice).append("\n");
//       scanner.next

      switch (userChoice) {
        case 1:
          codeSource = "int x = 43; if (x > 0) { x = x + 1; } \" This is a string \" ";
//          codeSource = "333445 2333 2323 3232";
          System.out.println(codeSource);
        userLog.append("Inputted Code: ").append(codeSource).append("\n");
          break;

        case 2:
          System.out.println("Enter your code:");
          scanner.nextLine() ;
          codeSource = scanner.nextLine();
          userLog.append("Inputted Code: ").append(codeSource).append("\n");
          break;

        case 3:
          // By launching JavaFX on a different thread we can ensure safe thread behaviour and avoid exceptions form unpredictability
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

      // Create an instance of LexicalAnalyzer with the input string and then tokenizing the codeSource
      Lexical lexerInstance = new Lexical(codeSource);
      List<Tokens> tokens = lexerInstance.codeToTokens();
      Printer printer = new Printer(lexerInstance);

      Printer.displayCodeSource(codeSource);
      do {
      Printer.displayPrintMenu();
      userChoice = scanner.nextInt();
      userLog.append("Print Menu Option Selected: ").append(userChoice).append("\n");
//    scanner.nextLine();

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
      case 1:
        SaveUserFile.saveToFile(userLog.toString());
//        SaveUserFile.main(new String[0]);
//        saveFile(userLog.toString()) ;
        System.out.println("Entire File Saved !!");
        break;
      case 2:
        StringBuilder outputString = new StringBuilder();
        if (userChoice == 1) {
          outputString.append(printer.printTokensList());
//          saveFile(outputString.toString());
      } else if (userChoice == 2) {
          outputString.append(printer.printTokensMap());
//          saveFile(outputString.toString());
        } else {
          outputString.append(printer.printTokenCounts());
//          saveFile(outputString.toString());
        }
        SaveUserFile.saveToFile(outputString.toString());
//        SaveUserFile.main(new String[0]);  // Start new JavaFX application
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


  @Override
  public void start(Stage lexStage) throws Exception {
    lexStage.setTitle("Lexical Analyzer");
    Button browseButton = new Button("Browse for Files");
    browseButton.setOnAction(tmp -> codeSourceFile(lexStage));

    VBox vbox = new VBox(browseButton);
    Scene scene = new Scene(vbox, 300, 200);

    lexStage.setScene(scene);
    lexStage.show();

  }

  private static void codeSourceFile(Stage lexStage) {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Select your code file to be Analyzed !! :D");
    fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Files", "*.*"),
            new FileChooser.ExtensionFilter("Java files", "*.java*")
    );

    File fileChosen = fileChooser.showOpenDialog(lexStage);
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
//        Platform.runLater(lexStage::close) ;
      } catch (IOException e) {
        System.err.println("File load was unsuccessful :( : "+ e.getMessage());
      }
    } else {
      System.out.println("User Cancelled");
    }
  }


//  private static void saveFile(String userOutput) {
//    FileChooser fileChooser = new FileChooser() ;
//    fileChooser.setTitle("Save your lexical analysis to a file !! :D");
//    Platform.runLater(() ->  launch(args) {
//
//    Stage saveLexStage = new Stage();
//
//    File userFile = fileChooser.showSaveDialog(saveLexStage);
//    if (userFile != null) {
//      try (FileWriter fileWriter = new FileWriter(userFile)) {
//        fileWriter.write(userOutput);
//        System.out.println("Your file was saved !! Congratulations !!");
//      } catch (IOException e) {
//        System.err.println("Your save failed :( " + e.getMessage());
//      }
//    }
//    });
//  }

  // Getter methods
  public static String getCodeSource() {
    return codeSource;
  }
  public static void setCodeSource(String codeSource) {
  }

  public static boolean getIsFileLoaded() {
    return isFileLoaded;
  }

  public static Object getFileLoadMutex() {
    return fileLoadMutex ;
  }
}
