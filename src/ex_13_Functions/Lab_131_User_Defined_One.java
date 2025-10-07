package ex_13_Functions;

import java.util.Scanner;

public class Lab_131_User_Defined_One {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println(scanner);

        int result = sum_of_two_numbers(a,b);
        int result2 = sum_of_two_numbers(10,45);

        int result3 = sum_of_two_numbers(33,3333);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static void sum_of_two_numbers() {
        System.out.println("Hi, Their");
    }
}
