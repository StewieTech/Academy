package Compiler;

import java.util.List;
import java.util.Map;

public class UI {
  public static void main(String[] args) {
    // Example input string
//    String codeSource = "int x = 42; if (x > 0) { x = x + 1; }";
    String codeSource = "44445";

    // Create an instance of LexicalAnalyzer with the input string
    Lexical lexerInstance = new Lexical(codeSource);

    // Tokenize the input string
    List<Tokens> tokens = lexerInstance.codeToTokens();
    // Display the tokens
    System.out.println("Tokens:");
    for (Tokens token : tokens) {
      System.out.println(token);
    }

    // Display the token map
    System.out.println("\nToken Map:");
    for (Map.Entry<TokenType, List<Tokens>> element : lexerInstance.getTokenMap().entrySet()) {
      System.out.println(element.getKey() + ": " + element.getValue());
    }

    // Display the token counts
    System.out.println("\nToken Counts:");
    for (Map.Entry<TokenType, Integer> element : lexerInstance.getTokenCount().entrySet()) {
      System.out.println(element.getKey() + ": " + element.getValue());
    }
  }
}
