package Compiler;

import java.util.HashMap;
import java.util.Map;

/* 
 * Updating this function to use HashMaps instead of ArrayLists
 *
 * */

public class Lexical {
  // I want to ingest the user's input and spit it out into tokens
  private String userInput; // should this be constant ?
  private int keywordsIndex;
  private Map<TokenType, List<Token>> tokensMap;
  private Map<TokenType, Integer> tokenCount;
  // List<String> keywords = new ArrayList<>(); // should this be immutable ?

  public Lexical(String userInput) {
    this.userInput = userInput;

    // this.userInputLength = userInput.lenth(); // may not need this
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

  public consumeNumber() {
    StringBuilder numberString = new StringBuilder() 
  }
}
