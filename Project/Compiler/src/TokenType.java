package Academy.Project.Compiler.src;

public enum TokenType {
    // originally was going to use public static final's but enum's are generally recommended
    // <https://stackoverflow.com/questions/9969690/whats-the-advantage-of-a-java-enum-versus-a-class-with-public-static-final-fiel>
   // <https://stackoverflow.com/questions/17848207/making-a-lexical-analyzer>
    IDENTIFIER, KEYWORD, NUMBER, STRING, OPERATOR, SEPERATOR, COMMENT, WHITESPACE, ERROR;
   
}