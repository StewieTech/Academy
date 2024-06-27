package Compiler;

import java.util.ArrayList;
import java.util.List;

public class Lexical {
	// I want to ingest the user's input and spit it out into tokens
	private String userInput ; // should this be constant ?
	private int keywordsIndex;
	List<String> keywords = new ArrayList<>();	// should this be immutable ?
	
	public Lexical(String userInput) {
		this.userInput = userInput ;
		
		
//		this.userInputLength = userInput.lenth(); // may not need this
	}
	
	//I am going to be returning a tokentype based on what the character is
	public List<TokenType> tokenize() {
		while (keywordsIndex < userInput.length()) {
			switch ()
			
		}
		
	}

}
