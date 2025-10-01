package ex_09_Switch;

public class Lab_94_JDK13 {
    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 006;
        switch (itemCode)
        {
            case 001,002,003:
                System.out.println("All of the are electronic gadget");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
