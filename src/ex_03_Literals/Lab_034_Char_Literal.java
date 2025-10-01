package ex_03_Literals;

public class Lab_034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A';// A to Z , a-z, !@#$%^&*()_+
//        char c = "A"; // ""== String = Bunch of char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // Blank Space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Rupak Shinde");
        System.out.println("Rupak"+new_line+"Shinde");
        System.out.println("Rupak \nShinde");
        System.out.println("Rupak"+tab_line+"Shinde");
        System.out.println("Rupak"+back_space+"Shinde");
        System.out.println("-----");

        System.out.println("Hi, This is a first line"+new_line+"This is second line \n This is third line");

        char c10 = 'A';
//        ASCI ,(limlted numbers) - A -> 65

        char rupee = '₹';
        System.out.println(rupee);

        char my_lauugh_smily = '\u1f60';
        System.out.println(my_lauugh_smily);

//        char c11 = '\u1F60';_No
    }
}
