package Compiler;


// a lexeme is a sequence of characters in the source code that matches a token
// pattern
public  class Tokens {
    private final TokenType type;
    private final String lexeme;

    public Tokens(TokenType type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme
        ;

    }

    public TokenType getType() {
        return type;
    }

    public String getLexeme() {
        return lexeme;
    }

    @Override
    public String toString() {
        return String.format("%s: %s ", type, lexeme);
    }
}


