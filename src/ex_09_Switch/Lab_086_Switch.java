package ex_09_Switch;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Lab_086_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Day to 1 - 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
            }
        }
    }
}