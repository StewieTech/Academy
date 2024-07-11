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

    // Printing... ensures main and JavaFX thread aren't printing to the console at the same time
    public String printTokensList() {
        System.out.println("Printing... ");
        try {
            Thread.currentThread().sleep(2000);
        StringBuilder stringOutput = new StringBuilder();
       stringOutput.append("\n Tokens Listed: \n");
        Map<TokenType, List<Tokens>> tokenMap = lexerInstance.getTokenMap();

        tokenMap.forEach((type, tokenList) -> {
            tokenList.forEach(element -> stringOutput.append(element).append(", ")  ) ;
        });
        return stringOutput.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    public String printTokensMap() {
        System.out.println("Printing... ");
        try {
            Thread.currentThread().sleep(2000);
            StringBuilder stringOutput = new StringBuilder() ;
            stringOutput.append("\n Token Map: \n");
            for (Map.Entry<TokenType, List<Tokens>> element : lexerInstance.getTokenMap().entrySet()) {
                stringOutput.append(element.getKey()).append(": ").append(element.getValue()).append("\n");
            }
            return stringOutput.toString() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    public String printTokenCounts() {
        System.out.println("Printing... ");
        try {
        Thread.currentThread().sleep(2000);
        StringBuilder stringOutput = new StringBuilder() ;
        stringOutput.append("\n Token Counts: \n");
        for (Map.Entry<TokenType, Integer> element : lexerInstance.getTokenCount().entrySet() ) {
            stringOutput.append(element.getKey()).append(": ").append(element.getValue()).append("\n") ;
        }
        return stringOutput.toString() ;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "null" ;
    }


    public static void displayInitialMenu() {
        System.out.println("\n Welcome to the Lexical Analyzer !! \n Please select an Input option to analyze your code \n ");
        System.out.println("1. Click here to use an example code input for the Lexical Analyzer");
        System.out.println("2. Enter your code/input into a Scanner");
        System.out.println("3. Input your code file using JavaFX");
        System.out.println("0. Exit");
        System.out.print("Enter a number for your choice: \n");
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
