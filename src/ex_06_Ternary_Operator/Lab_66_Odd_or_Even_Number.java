package ex_06_Ternary_Operator;

public class Lab_66_Odd_or_Even_Number {
    public static void main(String[] args) {
        int num = 8;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}
