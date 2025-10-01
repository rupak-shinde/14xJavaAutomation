package ex_09_Switch;

import java.util.Scanner;

public class Lab_085_Switch {
    public static void main(String[] args) {
// Without Break; Statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Day to 1 - 7");

        if (scanner.hasNextInt())
        {
            int day = scanner.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
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
