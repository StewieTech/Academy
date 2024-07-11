package Compiler;

/*
 * Lexical.java is the heart of the Lexical Analyzer.
 * I have built a codeToTokens method that finds the enum that each character belongs to and then I put the entity into the keymap their respective enum.
 * Hashmaps made more sense to me over Arraylists as it would be simple to retrieve the value's and display them to the end user
 *
 * */

// a lexeme is a sequence of characters in the source code that matches a token
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


