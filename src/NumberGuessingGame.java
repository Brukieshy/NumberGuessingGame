import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {


    public static void main (String []args) {

        //declare
        Scanner keyboard;
        Scanner continueKB;
        int pickedNumber;
        int go = 0;
        String keepGoing;


        //initialize
        keyboard = new Scanner(System.in);
        continueKB = new Scanner(System.in);

        Random generator = new Random();


        int numberOfTries = 0;

        int guess;

        System.out.println("Greetings! Pick numbers between 1 and 1000 to win!");
        while (go == 0) {


            int numberToGuess = generator.nextInt(1000);
            System.out.println(numberToGuess);
            boolean win = false;
            System.out.println("Pick a number between 1 and 1000");
            pickedNumber = keyboard.nextInt();
            numberOfTries++;
            while (!win) {

                if (pickedNumber == numberToGuess) {
                    win = true;


                } else if (pickedNumber < numberToGuess) {
                    System.out.println("The number you have chosen is too low. Guess again:");
                    pickedNumber = keyboard.nextInt();
                } else if (pickedNumber > numberToGuess) {
                    System.out.println("The number you have chosen is too high. Guess again:");
                    pickedNumber = keyboard.nextInt();
                }

            }



            System.out.println("You won! The number you have chosen, " + pickedNumber + " was the right number. ");
            System.out.println("Would you like to play again?");
            System.out.println("Type 'y' for yes or 'n' for no.");
            keepGoing = continueKB.nextLine();
            go = keepGoing.indexOf("y");

        }

        System.out.println("Thanks for playing the Number Guessing Game! Have a good day!");


    }

}


