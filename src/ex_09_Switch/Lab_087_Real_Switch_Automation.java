package ex_09_Switch;

import java.util.Scanner;  // ✅ Import Scanner

public class Lab_087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Use to decide which browser automation to start
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser:");
        String browser = scanner.nextLine();  // ✅ Reads full line input

        switch (browser.toLowerCase()) {  // ✅ Handles case sensitivity
            case "chrome":
                System.out.println("Starting Chrome...");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting Firefox Browser...");
                // Further code to start the Firefox
                // WebDriver driver = new FirefoxDriver(); // Example Selenium code
                break;

            case "edge":
                System.out.println("Executing Edge Code...");
                break;

            default:
                System.out.println("I have no idea which browser this is!");
                break;
        }

        scanner.close();
    }
}
