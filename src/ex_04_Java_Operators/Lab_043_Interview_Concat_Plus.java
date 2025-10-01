package ex_04_Java_Operators;

public class Lab_043_Interview_Concat_Plus {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 10;
        System.out.println(a+b);

//        +  -> String -> Concanatation
        String first_name = " Rupak";
        String last_name = " Shinde";
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);

        System.out.println(first_name+last_name+(a+b));
    }
}
