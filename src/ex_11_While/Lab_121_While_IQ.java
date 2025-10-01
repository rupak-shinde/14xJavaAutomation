package ex_11_While;

import java.util.Scanner;

public class Lab_121_While_IQ {
    public static void main(String[] args) {


        // Factorial Program
        // Data Type input & Output
        // Write a rough logic around it
        // Write a proper logic around this
        // Optimize
        // Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number for Factorial Program!");
        if (!scanner.hasNextInt())
        {
            System.out.println("You Fool Int Only !!");
        }else
        {
            int number = scanner.nextInt();
            int fact = 1;
            if(fact==1)
            {
                fact = 1;
                System.out.println("Fact = 1");
            }
            if (number < 0 || number > Integer.MAX_VALUE)
            {
                System.out.println("Can't get factorial as out of bound! (Int)");
            }
            int i = 1;
            while (i<=number)
            {
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
