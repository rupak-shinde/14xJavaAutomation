package ex_04_Java_Operators;

public class Lab_040_Relational_Operators {
    public static void main(String[] args) {
        // < -> Less than
        // < = -> Less than or equal to
        // > -> Greater
        // > = -> Greater than equal to
        // == -> Equal to (but checking)
        // != -> Not Equal to

        int a = 10 ;
        int b = 30 ;
        boolean c = a > b ; // 10 > 30
        System.out.println(c);

        int age_sham = 33 ;
        int age_rupak = 34;

        boolean result = age_rupak >= age_sham;
        System.out.println(result);
    }
}
