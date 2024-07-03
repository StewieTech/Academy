package Compiler;

import java.util.List;
import java.util.Map;

public class Printer {
    private Lexical lexerInstance ;

    public Printer(Lexical lexerInstance) {
        this.lexerInstance = lexerInstance;
    }

    public void printTokensList() {
        List<Tokens> tokens = lexerInstance.codeToTokens();
        System.out.println("Tokens Listed");
        for (Tokens token : tokens) {
            System.out.println(token);
        }
    }

    public void printTokensMap() {
        System.out.println("Token Map");
        for (Map.Entry<TokenType, List<Tokens>> element : lexerInstance.getTokenMap().entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }

    public void printTokenCounts() {
        System.out.println("Token Counts:");
        for (Map.Entry<TokenType, Integer> element : lexerInstance.getTokenCount().entrySet() ) {
            System.out.println(element.getKey() + ": " + element.getValue()) ;
        }
    }


    public static void displayInitialMenu() {
        System.out.println("Welcome to the Lexical Analyzer !! \n Please select an Input option \n ");
        System.out.println("1. Click for Example");
        System.out.println("2. Enter your code using a Scanner");
        System.out.println("3. Enter code using a FileInput");
        System.out.println("0. Exit");
        System.out.print("Enter a number for your choice");
    }

    public static void displayPrintMenu() {
        System.out.println("What do you want to Print?");
        System.out.println("1. Print Tokens in a List");
        System.out.println("2. Print Tokens in a Map");
        System.out.println("3. Print Tokens with their Counts");
        System.out.println("0. Exit");
        System.out.print("Enter a number for your choice");
    }
}
