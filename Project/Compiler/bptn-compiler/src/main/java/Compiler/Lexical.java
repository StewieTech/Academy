package Compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* 
 * Updating this function to use HashMaps instead of ArrayLists
 *
 * */
public class Lexical {
  // I want to ingest the user's input and spit it out into tokens
  private String userInput; // should this be constant ?
  private int positionIndex;
  private Map<TokenType, List<Tokens>> tokensMap;
  private Map<TokenType, Integer> tokenCounter;

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

  // Here I am just looking at the character
  private char peek() {
    return userInput.charAt(positionIndex);
  }

  // I want to injest the character then advance the position one over
  private boolean isSeparator(char character) {
    return "{}(),;".indexOf(character) != -1;
  }

  private boolean isOperator(char character) {
    return "+-*/|&!=%<>".indexOf(character) != -1;
  }

  private boolean isKeyword(String element) {
    return Set.of("if", "else", "return", "for", "while").contains(element);
  }

  private char consume() {
    return userInput.charAt(positionIndex++);
  }

  private Tokens consumeNumber() {
    StringBuilder numberString = new StringBuilder();
    while (positionIndex < userInput.length() && Character.isDigit(peek())) {
      numberString.append(consume());
    }
    return addTokens(TokenType.NUMBER, numberString.toString());
  }

  private Tokens consumeString() {
    StringBuilder wordString = new StringBuilder();
    consume();
    while (positionIndex < userInput.length() && peek() != '"') {
      wordString.append(consume());
    }
    consume();
    return addTokens(TokenType.STRING, wordString.toString());

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

  public Tokens consumeIdentifierOrKeyword() {
    StringBuilder wordString = new StringBuilder();
    while (positionIndex < userInput.length() && Character.isLetterOrDigit(userInput.charAt(positionIndex))) {
      wordString.append(userInput.charAt(positionIndex));
      positionIndex++ ;
    }
    String element = wordString.toString();
    TokenType type = isKeyword(element) ? TokenType.KEYWORD : TokenType.IDENTIFIER;
    return addTokens(type, element);
  }

  // I am going to be returning a tokentype based on what the character is
  public List<Tokens> codeToTokens() {
    List<Tokens> tokenList = new ArrayList<>();
    while (positionIndex < userInput.length()) {
      char currentCharacter = userInput.charAt(positionIndex);

      if (Character.isDigit(currentCharacter)) {
        tokenList.add(consumeNumber());
      } else if (Character.isWhitespace(currentCharacter)) {
        consumeWhitespace();
      } else if (isSeparator(currentCharacter)) {
        tokenList.add(consumeSeperator());
      }   else  if (isOperator(currentCharacter)) {
           tokenList.add(consumeOperator());

      } else if (Character.isLetter(currentCharacter)) {
        tokenList.add(consumeIdentifierOrKeyword());
      } else {
          tokenList.add(consumeError());
      }



//        tokenList.add(new Tokens(TokenType.ERROR, String.valueOf(consume())));
    }
    return tokenList;

  }

  // functions

  // helper functions, may move to new file not sure yet
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
