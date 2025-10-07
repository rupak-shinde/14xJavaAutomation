package ex_13_Functions;

public class Lab_130_Simple_Method {
    public static void main(String[] args) {
        non_retun_type_function();

        String name = retun_string_type_function();
        System.out.println(name);
    }
    static void  non_retun_type_function(){
        System.out.println("Hi, there No return function");
    }
    // Return type - (int, string , char, boolen, float\
    static String retun_string_type_function(){
        System.out.println("Hi, Thier I will return something.");
        return  "Pramod";
    }
    static  boolean return_boolen(){
        return true;
    }
    static  float return_float_PI_Value(){
        return  3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 10l;
    }
}
