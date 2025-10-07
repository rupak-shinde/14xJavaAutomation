package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_148_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programing");
        System.out.println(sb);

        sb.replace(0,4,"c++");
        System.out.println(sb);
    }
}
