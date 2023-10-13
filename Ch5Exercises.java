import java.util.Random; 
import java.util.Scanner; 

public class Ch5Exercises {

    public static int makeGuess() {
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in); 
        int guess = in.nextInt(); 
        return guess; 
    }

    public static void main (String[] args) {
        
     /* // problem 5.1
        int x = -4; 
        if (x>0 && x<10) {
            System.out.println("Positive single digit number"); 
        } */

        // problem 5.2
        // pick a random number
        Random random = new Random();
        int myNumber = random.nextInt(100) + 1; 
        System.out.print("I'm thinking of a number between 1 and 100 (inclusive). ");
        System.out.println("Can you guess what it is in three tries? ");  
        int guess = makeGuess(); 

        // response
        int incorrect = 0; 
        for (int i = 0; i<2; i++) {
            if (guess<myNumber) {
                System.out.println("Your guess was too low. Try again.");
                guess = makeGuess();  
            } else if (guess>myNumber) {
                System.out.println("Your guess was too high. Try again.");
                guess = makeGuess();  
            } else if (guess==myNumber) {
                break;
            }
        } 

        if (!(guess==myNumber)) {
            System.out.println("You ran out of guesses. My number was " + myNumber + ". "); 
        } else if (guess==myNumber) {
            System.out.println("You are correct! My number was " + myNumber + ". ");
        }


    }

}