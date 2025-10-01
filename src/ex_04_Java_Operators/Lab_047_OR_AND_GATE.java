package ex_04_Java_Operators;

public class Lab_047_OR_AND_GATE {
    public static void main(String[] args) {
//        || OR GATE
        System.out.println(true || true);
        // AND Gate truth table
        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false
    }
}
