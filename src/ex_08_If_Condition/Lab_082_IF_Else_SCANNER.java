package ex_08_If_Condition;
import java.util.Scanner;

public class Lab_082_IF_Else_SCANNER {
    public static void main(String[] args) {
        // Allowed to vote or not - Age
        // If age > 18 -> Allowed to vote.
        // else age <> 18 -> Not allowed to vote.

        // How to check user input
        // 1. CLI Options
        // int age = Integer.parseInt(args[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your AGE");
        int age = scanner.nextInt();
        System.out.println(age);


    }
}
