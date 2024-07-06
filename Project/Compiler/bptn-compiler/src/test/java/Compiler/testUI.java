package Compiler;//package Compiler;
//
//import org.junit.jupiter.api.Test;
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class LexicalTest {
//
//    @Test
//    public void testConsumerNumber() {
//        System.out.println("Testing ConsumeNumber");
//        Lexical lexeme = new Lexical("444555");
//
//        List<Tokens> tokenList = lexeme.codeToTokens();
//        System.out.println("Created Lexical instance");
//
//        assertEquals(TokenType.NUMBER, tokenList.get(0).getType());
//        System.out.println("The Type of token matches !!");
//
//        assertEquals("444555", tokenList.get(0).getLexeme());
//       System.out.println("The right Lexeme was found!!");
//
//        assertEquals(1, tokenList.size());
//        System.out.println("List size is correct!");
//    }
//}
