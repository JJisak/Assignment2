
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100");
        int randomNum = rand.nextInt(100) + 1;
        System.out.println(randomNum); //for testing
        int guess = scan.nextInt();
int tries = 4;
        for (int i = 0; i < 5; i++) {
            if (guess < 0 || guess > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again");
                i--;
            }
            if (guess > randomNum) {
                System.out.println("Please pick a lower number");
            }
            if (guess < randomNum) {
                System.out.println("Please pick a higher number");
            }
            if (guess == randomNum) {
                System.out.println("You Win!");
                break;
            }
            if (i == 4) {
                System.out.println("You lose!");
                System.out.println("The number to guess was: " + randomNum);
                break;
            }
            System.out.println("You have " + (tries - i) +" tries left");
            System.out.println("Enter your next guess: ");
            guess = scan.nextInt();
        }

    };
};