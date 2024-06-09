package challenge;
import java.util.Scanner;

public class ChangeGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double pennyValue = 0.01;
        Double nickelValue = 0.05;
        Double dimeValue = 0.10;
        Double quarterValue = 0.25;


        System.out.println("How many Pennies?");
        Double Pennies = scanner.nextDouble();

        System.out.println("How many Nickels?");
        Double Nickels = scanner.nextDouble();

        System.out.println("How many Dimes?");
        Double Dimes = scanner.nextDouble();

        System.out.println("How many Quarters?");
        Double Quarters = scanner.nextDouble();

        Double totalCount = (Pennies * pennyValue) + (Nickels * nickelValue) + (Dimes * dimeValue) + (Quarters * quarterValue);

        Double  dollarVariance = 1 - totalCount;

        System.out.println("Total Change: " + totalCount);

        if (dollarVariance == 0) {
            System.out.println("You won baby!!");
        }
            else if (dollarVariance < 0 ) {
                System.out.println("You too high baby!");
            } else {
                System.out.println("You too low baby baby!!");
            }
        };


};

