 package challenge;

 import java.util.Random;
 import java.util.Scanner;

 public class dieRoll {

    public static void main(String[] args) {
        Random random = new Random();
        int rollCount = 0;
        int maxRoll = 5;
        int totalDieScore = 0;
        int rollScore ;
        Scanner sc = new Scanner(System.in);

        while (rollCount != maxRoll) {
            rollCount++;
            System.out.println("Welcome to Dice Roll :) Type anything to roll a die");
            sc.next();

        int die = random.nextInt(6) + 1;
            rollScore = die;
            totalDieScore += rollScore;
            int spacesTo20 = 20 - totalDieScore;

            if (spacesTo20 > 0) {
            System.out.println("Roll #" + rollCount + ": You've rolled a " + rollScore + ". You are now on space " + totalDieScore + " and have " + spacesTo20 + " more to go." ) ;
            System.out.println(rollScore);
            } else if (spacesTo20 == 0 ) {
                System.out.println("Roll #" + rollCount + ": You've rolled a " + rollScore + ". You are now on space " + totalDieScore + ". Congrats, You Win!");
            } else  {
                System.out.println("You went over 20 !! your terrible at this game !!");
            }

        }


        System.out.print("You");



        
    }
    
}
