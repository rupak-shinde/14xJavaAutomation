package ex_06_Ternary_Operator;

public class Lab_064_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21 ;
        // Nested Ternary
        // result = condition 1 ? Expression 1: Condition 2? Expression 2: Expression 3;
        String result = (age > 18) ? (age > 25 ? "You can't drink" : "You can go to Goa but can't drink") : "No";
        System.out.println(result);
    }
}
