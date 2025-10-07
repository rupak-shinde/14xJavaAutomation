package ex_15_String_Buffer_Builder_StringFunction;

public class Lab_143_String_Functions {
    public static void main(String[] args) {
        String name = "Rupak";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10)); //java.lang.StringIndexOutOfBoundsException

        // 2. Concat()
        System.out.println(name.concat("Shinde"));

        //3. Contains()
        System.out.println(name.contains("pa"));

        // 4. Equals ()
        System.out.println(name.equals("Rupak"));

        // 5. EqualIgnoreCase
        System.out.println(name.equalsIgnoreCase("Rupak"));

        // 6. Indexof() // Rupak -> > 0
        System.out.println(name.indent('a'));

        String s1 = "madam";
        // Returns the index within this string of the
        // First occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7.  lenght()
        System.out.println(name.length());

        // 8. replace()
        System.out.println(name.replace('a','o'));

        // 10. substring(,)
        System.out.println(name.substring(1,3));

        // 11. toLowerCase()
        System.out.println("RUPAK".toLowerCase());

        // 12. toUpperCase
        System.out.println("rupak".toUpperCase());

        // 14. starts with
        System.out.println(name.startsWith("R"));

        // 15. endsWith
        System.out.println(name.endsWith("a"));

        //16. trim()
        String name3 = "       Rupak   ";
        System.out.println(name3);

        // 17. compareTo()
        System.out.println(name.compareTo("Rupak"));

        // -------------------------------

        StringBuilder stringBuilder = new StringBuilder("rupak");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);





    }
}
