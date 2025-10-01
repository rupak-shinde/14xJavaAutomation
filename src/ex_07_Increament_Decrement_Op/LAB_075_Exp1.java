package ex_07_Increament_Decrement_Op;

public class LAB_075_Exp1 {
    public static void main(String[] args) {
        int a = 10 ;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++  -> A | 10 | 11
        // +
        // ++a -> B  | 12 | 12
    }
}
