package Compiler;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LexicalTest {



    @Test
    public void testConsumerNumber() {
        System.out.println("\nTesting ConsumeNumber");
        Lexical lexeme = new Lexical("444555");

        List<Tokens> tokenList = lexeme.codeToTokens();
        System.out.println("Created Lexical instance");

        assertEquals(TokenType.NUMBER, tokenList.get(0).getType());
        System.out.println("The Type of token matches !!");

        assertEquals("444555", tokenList.get(0).getLexeme());
       System.out.println("The right Lexeme was found!!");

        assertEquals(1, tokenList.size());
        System.out.println("List size is correct!");
    }

    @Test
    public void testIdentifierOrKeyword() {
        System.out.println("\nTesting Identifier / Keyward");
        String testWord = "int double variable String";
        Lexical lexeme = new Lexical(testWord);
        List<Tokens> tokens = lexeme.codeToTokens();

        assertEquals(4, tokens.size());
        System.out.println("SUCCESS: Identifier and keyword tokens were created!!");

        assertEquals(TokenType.KEYWORD, tokens.get(0).getType());
        System.out.println("First keyword matches!!");

        assertEquals("variable", tokens.get(2).getLexeme());
        System.out.println("the third Lexeme was correctly Created :D");

        assertEquals(TokenType.IDENTIFIER, tokens.get(2).getType());
        System.out.println("UNBELIEVABLE !! The types match :D");

    }

    // Test for the overall functionality of codeToTokens method
    @Test
    public void testCodeToTokens() {
        System.out.println("\n Testing Functionality of codeToTokens");
        String testInput = "double x = 7; // variable declaration";
        Lexical lexeme = new Lexical(testInput);
        List<Tokens> tokens = lexeme.codeToTokens();

        assertEquals(6, tokens.size()); // make sure number of tokens are generated correctly
        System.out.println("All tokens generated successfully");

        assertEquals(TokenType.KEYWORD, tokens.get(0).getType()); // Verify first token type
        assertEquals("double", tokens.get(0).getLexeme()); // Verify first token value
        System.out.println("First token matches!!");

        assertEquals(TokenType.IDENTIFIER, tokens.get(1).getType());
        assertEquals("x", tokens.get(1).getLexeme());
        System.out.println("Second token matches!!");

        assertEquals(TokenType.OPERATOR, tokens.get(2).getType());
        assertEquals("=", tokens.get(2).getLexeme());
        System.out.println("Third OPERATOR token matches!!");

        assertEquals(TokenType.NUMBER, tokens.get(3).getType());
        assertEquals("7", tokens.get(3).getLexeme());
        System.out.println("Fourth NUMBER token matches!!");

        assertEquals(TokenType.SEPERATOR, tokens.get(4).getType());
        assertEquals(";", tokens.get(4).getLexeme());
        System.out.println("Fifth SEPERATOR token matches!!");

        assertEquals(TokenType.COMMENT, tokens.get(5).getType());
        assertEquals(" variable declaration", tokens.get(5).getLexeme());
        System.out.println("Sixth COMMENT token matches!!");


    }
}
