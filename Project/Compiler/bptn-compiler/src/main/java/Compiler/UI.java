import java.util.List;
import java.util.Map;

public class UI {
    public static void main(String[] args) {
        // Example input string
        String codeSource = "int x = 42; if (x > 0) { x = x + 1; }";
        
        // Create an instance of LexicalAnalyzer with the input string
        Lexical lexer = new Lexical(userInput);
        
        // Tokenize the input string
        List<Token> tokens = lexer.codeToTokens();
        // Display the tokens
        System.out.println("Tokens:");
        for (Token token : tokens) {
            System.out.println(token);
        }

        // Display the token map
        System.out.println("\nToken Map:");
        for (Map.Entry<TokenType, List<Token>> entry : lexer.getTokenMap().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Display the token counts
        System.out.println("\nToken Counts:");
        for (Map.Entry<TokenType, Integer> entry : lexer.getTokenCountMap().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

