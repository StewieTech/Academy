package Compiler;

public enum TokenType {
  // originally was going to use public static final's but enum's are generally
  // recommended
  // <https://stackoverflow.com/questions/9969690/whats-the-advantage-of-a-java-enum-versus-a-class-with-public-static-final-fiel>
  // <https://stackoverflow.com/questions/17848207/making-a-lexical-analyzer>
  NUMBER, STRING, IDENTIFIER, KEYWORD, OPERATOR, SEPERATOR, WHITESPACE, COMMENT, ERROR;

}

class Tokens {
  private TokenType type;
  private String lexeme;

  Tokens(TokenType type, String lexeme) {
    this.type = type;
    this.lexeme = lexeme;

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

// A feature could be a UI example of all the different enum types for the
// lexical analyzer. The user would be able
/*
 * 
 * NUMBER
 * integers, floats, doubles
 * 123
 * 0
 * -456
 * 3.14
 * 2.718
 * 0.0
 * -1.5
 * 
 * STRING
 * characters in double quotes. This will have alot of corner cases I feel.
 * "hello"
 * "world"
 * "111"
 * "Hello World with Spaces."
 * "\"weird quote examples\""
 * "escape sequences \n \t"
 * 
 * 
 * IDENTIFIER
 * used for variables, classes, methods
 * myVariable
 * ClassName
 * methodName
 * 
 * KEYWORD
 * Used for reserved words
 * if
 * else
 * for
 * while
 * return
 * int
 * float
 * char
 * void
 * public
 * private
 * 
 * 
 * OPERATOR
 * performs math operations on values and operations on variables // again will
 * probably need lots of exceptions here
 * + (addition)
 * - (subtraction)
 * (multiplication)
 * / (division)
 * % (modulus)
 * = (assignment)
 * == (equality)
 * != (inequality)
 * && (logical AND)
 * || (logical OR)
 * ! (logical NOT)
 * < (less than)
 * > (greater than)
 * <= (less than or equal to)
 * >= (greater than or equal to)
 * 
 * SEPARATOR
 * these define method blocks as well as seperate different elements of code.
 * { (left brace)
 * } (right brace)
 * [ (left bracket)
 * ] (right bracket)
 * ( (left parenthesis)
 * ) (right parenthesis)
 * , (comma)
 * ; (semicolon)
 * . (dot)
 * 
 * WHITESPACE
 * // not only spaces, tabs, newlines but also non-visible characters. I am not
 * sure what non visible characters are
 * (space)
 * \t (tab)
 * \n (newline)
 * // I need to understand these two better
 * \r (carriage return)
 * \f (form feed)
 * 
 * COMMENT
 * can't be executed and meant for documentation. // need to handle single and
 * double line examples
 * // single comment
 * /* multi comment
 */
/** Documentation comment */ // lol does Java even have these ?
/*
 * 
 * 
 * ERROR
 * unrecognized tokens or anything I haven't been able to classify
 * #unexpectedSymbol
 * 
 * @invalidToken
 * 123abc // variables can't start with numbers
 ** // need to look for Java specific invalid tokens
 * 
 * 
 */
