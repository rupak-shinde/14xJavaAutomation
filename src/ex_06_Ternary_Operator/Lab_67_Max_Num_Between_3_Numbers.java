package ex_06_Ternary_Operator;

public class Lab_67_Max_Num_Between_3_Numbers {
    public static void main(String[] args) {
        int n1 = 2, n2 = 9, n3 = -11;

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Maximum is: " + max);
    }
}
// LBF

// Logic Building Formula

// Step 1 -> Find the inputs and outputs data type.
// I/O -> n1,n2,n3 -> int
// O/P -> Int -> Max no or string we can message with max number

// step 2 -> Rough Logic Think about it.
// n1 -> n2 && n1 > n3 -> n1
// n2-> n3 && n2>n1 ->n2
// n3

// Step 3 - Dryn Run - Program

// int max = (n1 > n2)? (n1>n3)? n1:n3 :(n2>n3)? n2:n3;

