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
    public String printTokensList() {
        StringBuilder stringOutput = new StringBuilder();
       stringOutput.append("\n Tokens Listed: \n");
        Map<TokenType, List<Tokens>> tokenMap = lexerInstance.getTokenMap();

        tokenMap.forEach((type, tokenList) -> {
            tokenList.forEach(element -> stringOutput.append(element).append(", ")  ) ;
        });
        return stringOutput.toString();
    }



    public String printTokensMap() {
        StringBuilder stringOutput = new StringBuilder() ;
        stringOutput.append("\n Token Map: \n");
        for (Map.Entry<TokenType, List<Tokens>> element : lexerInstance.getTokenMap().entrySet()) {
            stringOutput.append(element.getKey()).append(": ").append(element.getValue()).append("\n");
        }
        return stringOutput.toString() ;
    }

    public String printTokenCounts() {
        StringBuilder stringOutput = new StringBuilder() ;
        stringOutput.append("\n Token Counts: \n");
        for (Map.Entry<TokenType, Integer> element : lexerInstance.getTokenCount().entrySet() ) {
            stringOutput.append(element.getKey()).append(": ").append(element.getValue()).append("\n") ;
        }
        return stringOutput.toString() ;
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

        public static void displaySavingMenu() {
            System.out.println("\n Do you want to save your output? ");
            System.out.println("1: Save ENTIRE Lexical Analyzer input To File");
            System.out.println("2. Save SPECIFIC lexical analyzer selection to file");
            System.out.println("9: Back to Main Menu");
            System.out.println("0: Exit Menu");
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
