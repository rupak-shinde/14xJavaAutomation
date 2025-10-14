package ex_16_Arrays;

public class Lab_164_2nd_Highest_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89,45,89 };
        int Highest = 0;
        int Second_Highest = 0;

        for (int num : numbers)
        {
            if (num > Highest)
            {
                Second_Highest = Highest;
                Highest = num;

            } else if (num > Second_Highest && num !=Highest) {
                Second_Highest = num;
            }

        }
        System.out.println(Second_Highest);
    }
}
