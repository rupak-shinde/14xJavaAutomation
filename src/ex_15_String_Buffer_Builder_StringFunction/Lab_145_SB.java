package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rupak");

        stringBuffer.append("Shinde");
        System.out.println(stringBuffer); // RupakShinde

        String s1 = "Rupak";
        s1 = s1 = s1+ "Shinde";
        System.out.println(s1);
    }
}
