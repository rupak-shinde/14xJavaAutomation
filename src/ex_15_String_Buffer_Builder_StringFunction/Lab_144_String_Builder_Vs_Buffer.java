package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_144_String_Builder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Rupak";
        String s1 = new String("Rupak");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Rupak");
        StringBuilder stringBuilder=new StringBuilder("Rupak");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
