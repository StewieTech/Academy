package Compiler;

import javafx.application.Application ;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javafx.stage.FileChooser;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UI extends Application {
    private static String codeSource = "";
    private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    // Example input string
//    String codeSource = "4444 { (43 + e 55";


    int userChoice;


    do {
      Printer.displayInitialMenu();
      userChoice = scanner.nextInt();
//       scanner.next

      switch (userChoice) {
        case 1:
          codeSource = "int x = 42; if (x > 0) { x = x + 1; } ' This is a string ' ";
//          codeSource = "333444 2333 2323 3232";
          System.out.println(codeSource);
          break;

        case 2:
          System.out.println("Enter your code:");
          scanner.nextLine() ;
          codeSource = scanner.nextLine();
          break;

        case 3:
          codeSourceFile();
          launch(args) ;
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
//    scanner.nextLine();

      switch (userChoice) {
        case 1:
          printer.printTokensList();
          break;

        case 2:
          printer.printTokensMap();
          break;

        case 3:
          printer.printTokenCounts();
          break;

        case 0:
          System.out.println("Thank You for using the Lexical Analyzer !! :D ");
          return ;

        default:
          System.out.println("Terrible Choice!! Please choose one of the available numbers");
      }
    } while ( userChoice != 0 ) ;
      scanner.close();
  }
  @Override
  public void start(Stage lexStage) throws Exception {
    lexStage.setTitle("Lexical Analyzer");
    lexStage.show();
  }

  private static void codeSourceFile() {
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Selete your code file to be Analyzed !! :D");
    fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Files", "*.*"),
            new FileChooser.ExtensionFilter("Java files", "*.java*")
    );

    File fileChosen = fileChooser.showOpenDialog(null);
    if (fileChosen != null) {
      try {
        codeSource = new String(Files.readAllBytes(fileChosen.toPath()));
        System.out.println("File loaded successfully!!: ");
        System.out.println(codeSource);
      } catch (IOException e) {
        System.err.println("File load was unsuccessful :( : "+ e.getMessage());
      }
    } else {
      System.out.println("User Cancelled");
    }
  }





}
