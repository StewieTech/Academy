package Compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* 
 * Lexical.java is the heart of the Lexical Analyzer.
 * I have built a codeToTokens method that finds the enum that each character belongs to and then I put the entity into the keymap their respective enum.
 * Hashmaps made more sense to me over Arraylists as it would be simple to retrieve the value's and display them to the end user. I also was able to have an ArrayLists within my Hashmap combining data structures to better store the data
 * By consisntently abstracting the methods, codeToToken's became easier to read and I was able to increase the complexity
 *
 * */


public class Lexical {
  // I want to ingest the user's input and spit it out into tokens
  private final String userInput;
  private int positionIndex;
  private Map<TokenType, List<Tokens>> tokensMap;
  private Map<TokenType, Integer> tokenCounter;

  // The constructor creates two HashMaps and populates them with the enum TokenTypes.
  public Lexical(String userInput) {
    this.userInput = userInput;
    this.positionIndex = 0;
    this.tokensMap = new HashMap<>();
    this.tokenCounter = new HashMap<>();
    for (TokenType type : TokenType.values()) {
      tokensMap.put(type, new ArrayList<Tokens>());
      tokenCounter.put(type, 0);
    }
  }


  // The Idea of peeking and consuming characters that the analyzer has seen allows for 'cleaner' iteration through the code source
  // peeking I am just looking at the character where consuming I am looking and updating my index. More in the article below
  // <https://supunsetunga.medium.com/writing-a-parser-algorithms-and-implementation-a7c40f46493d>
  private char peek() {
    return userInput.charAt(positionIndex);
  }

  private char peekNextCharacter() {
    return userInput.charAt(positionIndex + 1) ;
  }

  // The Boolean's simply clean up my codeToToken's method
  private boolean isSeparator(char character) {
    return "[](){};,.@".indexOf(character) != -1 || character == ':' && peekNextCharacter() == ':';
  }

  private boolean isOperator(char character) {
    return ".+-*/|&!=%<>^~".indexOf(character) != -1;
  }

  // below are all 67 of Java's Keywords
  // <https://www.geeksforgeeks.org/list-of-all-java-keywords/>
  private boolean isKeyword(String element) {
    return Set.of(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while",
            "true", "false", "null", "var", "yield",
            "_",
            "sealed", "non-sealed", "permits",
            "record",
            "exports", "module", "requires", "uses", "opens", "to", "with", "provides", "transitive"
    ).contains(element);
  }

  private char consume() {
    return userInput.charAt(positionIndex++);
  }


  // the consume functions call addTokens() and add the identified ENUM, and it's respective values to its correct spot within the HashMaps
  private Tokens consumeNumber() {
    StringBuilder numberString = new StringBuilder();
    while (positionIndex < userInput.length() && Character.isDigit(peek())) {
      numberString.append(consume());
    }
    return addTokens(TokenType.NUMBER, numberString.toString());
  }

  private Tokens consumeSeperator() {
    return addTokens(TokenType.SEPERATOR, String.valueOf(consume()));
  }

  private Tokens consumeOperator() {
    return addTokens(TokenType.OPERATOR, String.valueOf(consume()));
  }

  private Tokens consumeWhitespace() {
    while (positionIndex < userInput.length() && Character.isWhitespace(peek())) {
      consume();
    }
    return addTokens(TokenType.WHITESPACE, "A Space");
  }

  private Tokens consumeError() {
    return addTokens(TokenType.ERROR, String.valueOf(consume()));
  }

  private Tokens consumeString() {
    StringBuilder wordString = new StringBuilder() ;
    consume();
    while (positionIndex < userInput.length() && peek() != '"') {
      wordString.append(consume());
    }
    consume();
    return addTokens(TokenType.STRING, wordString.toString());
  }

  public Tokens consumeIdentifierOrKeyword() {

    StringBuilder wordString = new StringBuilder();
    while (positionIndex < userInput.length() && Character.isLetterOrDigit(peek())) {
      wordString.append(consume());
    }
    String element = wordString.toString();
    TokenType type = isKeyword(element) ? TokenType.KEYWORD : TokenType.IDENTIFIER;
//    System.out.println("Adding token: " + type + " -> " + element);
    return addTokens(type, element);
  }

  // Comments are interesting, in general we are looking for a / however we also have other charters like *. So we are making multiple conditions for each
  public Tokens consumeComment() {
    StringBuilder wordString = new StringBuilder();
    consume();
    if (peek() == '/') {
      consume();
      while (positionIndex < userInput.length() && peek() != '\n') {
        wordString.append(consume());
      }
    } else if (peek() == '*') {
      consume();
      while (positionIndex < userInput.length() - 1 && !( peek() =='*' && peekNextCharacter() == '/' )) {
        wordString.append(consume());
      }
      consume();
      consume();

    }
    return addTokens(TokenType.COMMENT, wordString.toString());
  }

  // I am going to be returning a tokentype based on what the character is
  public List<Tokens> codeToTokens() {
    List<Tokens> tokenList = new ArrayList<>();
    while (positionIndex < userInput.length()) {
      char currentCharacter = peek();
      if (currentCharacter == '"') {
        tokenList.add(consumeString());
      }
      else if (Character.isDigit(currentCharacter)) {
        tokenList.add(consumeNumber());
      } else if (Character.isWhitespace(currentCharacter)) {
        consumeWhitespace();
      } else if (isSeparator(currentCharacter)) {
        tokenList.add(consumeSeperator());
      } else if (Character.isLetter(currentCharacter)) {
        tokenList.add(consumeIdentifierOrKeyword());
      } else if (currentCharacter == '/' && (peekNextCharacter() == '/' || peekNextCharacter() == '*')) {
        tokenList.add(consumeComment());
      } else  if (isOperator(currentCharacter)) {
        tokenList.add(consumeOperator());
      } else {
        tokenList.add(consumeError());
      }
    }
    return tokenList;

  }

  // functions

  // Using my Tokens Constructor to insert the new element into the ArrayList within the Hashmap
  private Tokens addTokens(TokenType type, String element) {
    Tokens token = new Tokens(type, element);
    tokensMap.get(type).add(token);
    tokenCounter.put(type, tokenCounter.get(type) + 1);
    return token;
  }

  public Map<TokenType, List<Tokens>> getTokenMap() {
    return tokensMap;
  }

  public Map<TokenType, Integer> getTokenCount() {
    return tokenCounter;
  }

}
