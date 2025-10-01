package ex_09_Switch;

import java.util.Scanner;

public class Lab_084_Switch {
    public static void main(String[] args) {
        // You Need to take a user input and  ask for the interger between 1-7.
        // and ask for the interger between 1-7
        // You will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the scnanner class.
        // Step 2 - Number two will be basically figurring out the expression and the day.
        // Step 3 - We will basically add step 3 as a rough logic.
        // Step 4 - Write fix logic and optimize
        // Step 5 - Figure out edge cases.

        // Step 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Day to 1 - 7");

        if (scanner.hasNextInt())
        {
            int day = scanner.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please Enter between 1-7 You Fool!");


            }
        }
        else
        {
            System.out.println("Enter Interger You FOOL!");
        }
    }
}
