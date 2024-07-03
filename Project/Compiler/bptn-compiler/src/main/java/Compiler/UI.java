package Compiler;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UI {
  public static void main(String[] args) {
    // Example input string
//    String codeSource = "4444 { (43 + e 55";


    Scanner scanner = new Scanner(System.in);
    String codeSource = "";
    int userChoice;


    do {
      Printer.displayInitialMenu();
      userChoice = scanner.nextInt();
//       scanner.next

      switch (userChoice) {
        case 1:
          codeSource = "int x = 42; if (x > 0) { x = x + 1; }";
          break;

        case 2:
          System.out.println("Enter your code:");
          codeSource = scanner.nextLine();
          break;

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
}
