package ex_17_OOPs;

public class Person {

        // A: Valid local variable declarations inside main
        String name;
        int age;
        String gender;
        int salary;
        long phone_no;
        String address;
        String courseName;
        String paymentID;

        // B: REMOVED - You cannot define methods inside another method (main).
         void speak(){}; // INVALID
         void eat(){};   // INVALID
         void sleep(){}; // INVALID
         void doAssignment(){}; // INVALID
         void watchRecording(){}; // INVALID

    }
