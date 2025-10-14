package ex_16_Arrays;

import java.util.Scanner;

public class Inverted_Right_Triangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern e.g n = 3");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                //  System.out.print("\uD83D\uDE0A");

            }
            System.out.println(" ");

        }

    }
}