package abhinavsingh153;

import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args){

        int randomNumber = (int) (Math.random()* 100) + 1;
        boolean hasWon = false;

        System.out.println("Hey i have chosen a random number for you between 1to 100");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10 ; i > 0 ; i --){
            System.out.println("You have " + i + " guess(es) left. Choose again:");
            int guessedNumber = scanner.nextInt();

                if (randomNumber < guessedNumber){
                    System.out.println("It's smaller than " + guessedNumber);
                }
                else if (randomNumber > guessedNumber){
                    System.out.println("It's greater than " + guessedNumber);
                }
                //the number mathes with guessedNumber
               else {
                   hasWon = true;
                   break;
               }
        }

        // After we exit the loop we need to chech if they actually won or ran out of guesses.
        if (hasWon){
            System.out.println("CORRECT....You WON!");
        }
        else{
            System.out.println("GAME OVER.....YOU LOSE!");
            System.out.println("The number was " + randomNumber);
        }
        scanner.close();
    }
}
