package ex_09_Switch;

public class Lab_093_Interview {
    public static void main(String[] args) {
        // in JDK > 13
        int intemCode = 001;
        switch (intemCode)
                {
                 case 001 -> System.out.println("001");
                 case 002 -> System.out.println("002");
                 case 003 -> System.out.println("003");
                 default -> System.out.println("Defualt");
                }
    }
}
