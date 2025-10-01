package ex_09_Switch;

public class Lab_089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch)
        {
            case 65:
                System.out.printf("Match ASCII");
                break;
            default:
                System.out.printf("No Match");
        }
    }
}
