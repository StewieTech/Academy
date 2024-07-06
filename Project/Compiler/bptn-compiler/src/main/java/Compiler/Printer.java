package Compiler;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Printer {
    private Lexical lexerInstance ;

    public Printer(Lexical lexerInstance) {
        this.lexerInstance = lexerInstance;
    }

    static Scanner scanner = new Scanner(System.in);



//    public void printTokensList() {
//        List<Tokens> tokenList = lexerInstance.codeToTokens();
//        System.out.println("\n Tokens Listed");
//        for (Tokens token : tokenList) {
//            System.out.println(token);

//    }
    public void printTokensList() {
        System.out.println("\n Tokens Listed");
        Map<TokenType, List<Tokens>> tokenMap = lexerInstance.getTokenMap();

        tokenMap.forEach((type, tokenList) -> {
            tokenList.forEach(element -> System.out.println(element)) ;
        });
    }



    public void printTokensMap() {
        System.out.println("\n Token Map");
        for (Map.Entry<TokenType, List<Tokens>> element : lexerInstance.getTokenMap().entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }

    public void printTokenCounts() {
        System.out.println("\n Token Counts:");
        for (Map.Entry<TokenType, Integer> element : lexerInstance.getTokenCount().entrySet() ) {
            System.out.println(element.getKey() + ": " + element.getValue()) ;
        }
    }


    public static void displayInitialMenu() {
        System.out.println("\n Welcome to the Lexical Analyzer !! \n Please select an Input option \n ");
        System.out.println("1. Click for Example");
        System.out.println("2. Enter your code using a Scanner");
        System.out.println("3. Enter code using a FileInput");
        System.out.println("0. Exit");
        System.out.print("Enter a number for your choice: ");
    }

    public static void displayCodeSource(String codeSource) {
        System.out.println("\n Below is your input");
        System.out.println(codeSource);
        System.out.println("If above code looks good, Click to Continue");
        scanner.nextLine();



    }

    public static void displayPrintMenu() {
        System.out.println("\n What do you want to Print?");
        System.out.println("1. Print Tokens in a List");
        System.out.println("2. Print Tokens in a Map");
        System.out.println("3. Print Tokens with their Counts");
        System.out.println("9. Go back to Main Menu");
        System.out.println("0. Exit");
        System.out.print("Enter a number for your choice: ");
    }
}
