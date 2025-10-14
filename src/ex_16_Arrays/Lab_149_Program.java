package ex_16_Arrays;

import java.util.Scanner;

public class Lab_149_Program {
    public static void main(String[] args) {
        // Write  a program to reverse a string without using inbuilt functions

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string i will reverese it ");
        String user_input = scanner.next();

//        StringBuilder stringBuilder = new StringBuilder(user_input);
//        System.out.println(stringBuilder.reverse());

        // rupak -> user input.lenght(),charAt()
        String reverse_user_input = "";

        char[] arr = user_input.toCharArray();

        for(int i = user_input.length()-1;i>=0;i--) {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }

        System.out.println("Reversed string:\n " + reverse_user_input);

        scanner.close();

    }
}
