package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); //dlroW olleH
        System.out.println(sb);
    }
}
