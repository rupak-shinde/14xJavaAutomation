package ex_13_Functions;

import java.util.Scanner;

public class Lab_134_Function_Arth {
    public static void main(String[] args) {
        // Create a function sum, sub, mul , div
        // with paramenter a, b (take parameters from user)

        // logic building
        // Step 1: Input / Output
        // a,b - int -> scanner
        // int -> variablr result ->

        // step 2 - Rough Logic -> create functions
        // function -> type 4th with return type and with arguments / parameters

        // step 3 - Write the code and find the fix -> edge cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the num 1: ");
        int b = readInt(scanner, "Enter the num 2: ");

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);


        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);



    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the Interger only");
            System.exit(0);
            return 0;

        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by 0 is not ");
        }
        return a / b;
    }
    static int mul(int a,int b){
        return a * b;
    }
    static int mod(int a, int b){
        return  a % b;
    }
}
