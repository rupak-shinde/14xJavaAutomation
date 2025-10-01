package ex_05_TypeCasting;

public class Lab_59_TypeCasting_Narrowing {
    int val = 300;
//    byte b = val; // narrowing -> Impicit Casting - Valid ? No
    byte b = (byte) val; // narrowing -> Impicit Casting - Valid ? Yes

}
