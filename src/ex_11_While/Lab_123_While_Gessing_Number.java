package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_123_While_Gessing_Number {
    public static void main(String[] args) {
        // Gess a number between 1 and 100
        // n = 56
        // 90 , 60, 50, -> 50-60 Yes

        Random random = new Random();
        int numberToGesss = random.nextInt(100)+1;
       // System.out.println(numberToGesss);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int guess;
        int attempts = 1;

        while (true)
        {
            if (!scanner.hasNextInt())
            {
                System.out.println("Invalid Input! Please Enter a number:");
                scanner.next(); // Consume Invalid Token
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < 1 || guess > 100 )
            {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            if(guess<numberToGesss){
                System.out.println("Too Low, Try Again");
            } else if (guess > numberToGesss) {
                System.out.println("Too High, Try Again");
            }else
            {
                System.out.println("Correct! You Gessed it in" + attempts + "attempts");
                break;
            }
            {

            }

        }
    }
}
