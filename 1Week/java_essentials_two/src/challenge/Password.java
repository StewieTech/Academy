// package Academy.1Week.java_essentials_two.src.challenge;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        var Username = "johndoe";
        var Password = "ABC_1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a new Password: ");
        String newPassword = scanner.nextLine();

        if (
//                isPasswordMatch(newPassword, Password) &&
                 isUppercaseLetter(newPassword)
//                && isEightCharacters(newPassword) && isSpecialCharacter(newPassword)
        ) {
            Password = newPassword;
            System.out.println("Your New Password is: " + newPassword);
        } else {
            System.out.println("Error: please strengthen your password");
        }

        

    }

    public static boolean isPasswordMatch(String newPassword, String Password) {
        if (newPassword.equals(Password)) {
            System.out.println("Your Password is match");
            return true;
        } else {
        } return false;
            
    }

    public static boolean isUppercaseLetter(String newPassword) {
        for (int i = 0; i < newPassword.length(); i++  ) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                return false;
            }
        }
                System.out.println("Your Password has no uppercase letter");
        return true;
    }

    public static boolean isEightCharacters(String newPassword) {
        if (newPassword.length() <8) {
            System.out.println("Your Password needs more then 8 letters");
            return true;
        }
        return false;
    }

    public static boolean isSpecialCharacter(String newPassword) {
        for (int i = 0 ; i < newPassword.length(); i++) {
        if  (!(Character.isAlphabetic(newPassword.charAt(i))) || !(Character.isDigit(newPassword.charAt(i))))  {
        return false;
            }
        }
        System.out.println("Your Password needs needs a special character");
        return true;

    }

    
    
    
}
