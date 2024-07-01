package Compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

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
      tokensMap.put(type, new ArrayList<>());
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

  // I am going to be returning a tokentype based on what the character is
  public List<TokenType> tokenize() {
    List<TokenType> tokenList = new ArrayList<>();
    while (keywordsIndex < userInput.length()) {
      char currentCharacter = userInput.charAt(keywordsIndex);

    if (Character.isLetter(currentCharacter)) {
      tokenList.add(consumeIdentiferOrKeyword());
    } else if (Character.isDigit(currentCharacter)) {
      tokenList.add()
    }
			
		}
		
	}

  // functions
  public Tokens consumeIdentiferOrKeyword() {
    StringBuilder wordString = new StringBuilder();
    while (keywordsIndex < userInput.length() && Character.isLetterOrDigit(userInput.charAt(keywordsIndex))) {
      wordString.append(userInput.charAt(keywordsIndex));
    }
    String element = wordString.toString();
    if (keywords.contains(element)) {
      return new Tokens(TokenType.KEYWORD, element);
    } else {
      return new Tokens(TokenType.IDENTIFIER, element);
    }
  }

}
