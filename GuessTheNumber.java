import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 0;       
        int guess = 0;          
        int maxAttempts = 7;    

        
        System.out.println("Welcome to the Guess The Number Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();  
            attempts++;            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " tries!");
                break; 
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }
        }
        if (attempts == maxAttempts && guess != randomNumber) {
            System.out.println("\nSorry, you've used all your attempts. The correct number was: " + randomNumber);
        }
        sc.close();
    }
}
