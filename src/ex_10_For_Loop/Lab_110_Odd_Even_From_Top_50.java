package ex_10_For_Loop;

public class Lab_110_Odd_Even_From_Top_50 {
    public static void main(String[] args) {
        // To Find even number from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 0)
            //if (i%2 != 0) Odd
            {
                System.out.println("Evem -> "+i);
            }

        }
    }
}
