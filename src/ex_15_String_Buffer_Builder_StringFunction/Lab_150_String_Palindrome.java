package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_150_String_Palindrome {
    public static void main(String[] args) {
        // madam -> reverse -> madam
        // madam -> naman
        // user_input == reverse(user_input)
        String input = "rupak";
        String reversed = "";

//        for (int i = input.length()-1; i >=0 ; i--) {
//            reversed = reversed + input.charAt(i);
//        }

        int i = input.length() - 1;      // initialization
        while (i >= 0) {                 // condition
            reversed = reversed + input.charAt(i);
            i--;                         // decrement
        }


        if (reversed.equalsIgnoreCase(input))
        {
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
}
}