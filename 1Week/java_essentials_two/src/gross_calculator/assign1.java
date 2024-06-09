package gross_calculator;
import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String userSeason = "";
    System.out.println("Give me the best Season this year");
    userSeason = scanner.next();

    System.out.println("Whole Number?: ");
    String season = scanner.next();

    System.out.println("Adjective?: ");
    String Adjective = scanner.next();
    scanner.close();

    System.out.println("On a " + Adjective + " " + userSeason);
    }


}
