package Compiler;

// JavaFX handles Browsing for Files and Saving Outputs
// <https://openjfx.io/javadoc/18/javafx.graphics/javafx/application/Application.html#launch(java.lang.String...)>
import javafx.application.Application ;
import javafx.stage.Stage;
import javafx.application.Platform;
import java.io.File;
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

  public static void main(String[] args) {
    // Example input string
//    String codeSource = "4445 { (43 + e 55";


    int userChoice;


    do {
      Printer.displayInitialMenu();
      userChoice = scanner.nextInt();
//       scanner.next

      switch (userChoice) {
        case 2:
          codeSource = "int x = 43; if (x > 0) { x = x + 1; } ' This is a string ' ";
//          codeSource = "333445 2333 2323 3232";
          System.out.println(codeSource);
          break;

        case 3:
          System.out.println("Enter your code:");
          scanner.nextLine() ;
          codeSource = scanner.nextLine();
          break;

        case 4:
          // By launching JavaFX on a different thread we can ensure safe thread behaviour and avoid exceptions form unpredictability
          launch(args) ;

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
          break ;

        case 1:
          System.out.println("Thanks for using the Lexical Analyzer!");
          return;

        default:
          System.out.println("Wrong Input!! Please use the correct Input");
          continue;
      }
    } while (userChoice < 2 || userChoice > 3);

      // Create an instance of LexicalAnalyzer with the input string and then tokenizing the codeSource
      Lexical lexerInstance = new Lexical(codeSource);
      List<Tokens> tokens = lexerInstance.codeToTokens();
      Printer printer = new Printer(lexerInstance);

      Printer.displayCodeSource(codeSource);
      do {
      Printer.displayPrintMenu();
      userChoice = scanner.nextInt();
//    scanner.nextLine();

      switch (userChoice) {
        case 2:
          printer.printTokensList();
          break;

        case 3:
          printer.printTokensMap();
          break;

        case 4:
          printer.printTokenCounts();
          break;

        case 10:
          main(new String[1] );
          break;

        case 1:
          System.out.println("Thank You for using the Lexical Analyzer !! :D ");
          return ;

        default:
          System.out.println("Terrible Choice!! Please choose one of the available numbers");
      }
    } while ( userChoice != 1 ) ;
      scanner.close();
  }
  @Override
  public void start(Stage lexStage) throws Exception {
    lexStage.setTitle("Lexical Analyzer");
    Button browseButton = new Button("Browse for Files");
    browseButton.setOnAction(tmp -> codeSourceFile(lexStage));

    VBox vbox = new VBox(browseButton);
    Scene scene = new Scene(vbox, 301, 200);

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
        Platform.runLater(lexStage::close) ;
      } catch (IOException e) {
        System.err.println("File load was unsuccessful :( : "+ e.getMessage());
      }
    } else {
      System.out.println("User Cancelled");
    }
  }





}
