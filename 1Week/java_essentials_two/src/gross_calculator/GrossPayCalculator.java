package gross_calculator;

import java.util.Scanner;
//The folder is the package; first line must declare what package this in

// Java class is declared; methods have to sit inside the class
public class GrossPayCalculator {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        int hours = 0;
        System.out.println("How many hours you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        double payRate = 0;
        System.out.println("What's your payrate?");
        payRate = scanner.nextDouble();

        scanner.close();

        double salary = hours * payRate;

        System.out.println("Gross pay :" +  salary);

        
    }
}
