package ex_13_Functions;

public class Lab_132_UD_Part1 {
    public static void main(String[] args) {
        // User Defined Functions

        //1. Without parameters without return type
        //2. Without parameters but with return type
        //3. With parameters and without return type
        //4. With parameters with return type

        // 1. Without Parameters and without return type. (Declare) / Define
        wop_wor();

        // 2. Without Parameters and with return type.
        String msg = wop_wr_greet_2();
        System.out.println(msg);

        //3. With parameters and without return type. 90%
        greet_with_details("rupak", 65, 100);
        greet_with_details("shyam", 100, 120);

        //4. With parameters with return type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_three_numbers(3,5,6);
        float sum3 = sum_of_three_numbers_float(3.14f,6.43f,7.54f);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);


    }
    // 1. Without Parameters and without return type. (Declare) / Define

    static void wop_wor() {
        System.out.println("Hi, Type 1 function!");
        System.out.println("Hi, Their");
    }

    // 2. Without Parameters and with return type.
    static String wop_wr_greet_2() {
        System.out.println("Hi, Type 2 Function!");
        return "Hi, How are you";
    }

    //3. With parameters and without return type. 90%
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is->" + name + "\nYour age is " + age + "\nYour Salary is " + salary);
    }

    //4. With parameters with return type
    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }

    static int sum_of_three_numbers(int a, int b, int c) {
        return a + b + c;
    }
    static float sum_of_three_numbers_float(float a, float b, float c){
        return a+b+c;
    }
}
