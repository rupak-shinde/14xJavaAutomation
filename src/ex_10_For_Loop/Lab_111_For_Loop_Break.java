package ex_10_For_Loop;

public class Lab_111_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
           // System.out.println(i); 0-5
            if (i == 5)
            {
                break;
            }
            System.out.println(i); // 0 - 4
        }
    }
}
