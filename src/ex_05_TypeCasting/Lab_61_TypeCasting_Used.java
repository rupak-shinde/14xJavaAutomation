package ex_05_TypeCasting;

public class Lab_61_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100 ;
        float GST = 18.45f ;
//        int total = course + GST ; // Narrowing Implicit
        int total = course +(int)GST; // Narrowing - Explicit
        System.out.println(total);

        float total2 = course+GST; // Widening - Auto  - Implicit
        // float total3 = (float) course+GST; widening -> Explicit
        System.out.println(total);
    }
}
