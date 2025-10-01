package ex_02_Java_Basics;

public class Lab_024_PrintF {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
//        System.out.println(a);
//        System.out.println(b);

        System.out.printf("Value of a is %d %n", a);
        System.out.printf("Value of b is %d ", b);

//        %d -> int, byte, long, short, -> data type
//        %s ->  String
//        %f -> float, double
//        % -> boolean

        System.out.println();
        int Table = 9 ;
        System.out.printf("%d X 1 = %d ",Table,Table*1);

    }
}
