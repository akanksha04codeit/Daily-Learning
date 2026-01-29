package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidationDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter an integer: ");
                number = sc.nextInt();
                valid = true; // valid input
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                sc.next(); // clear wrong input
            }
        }

        System.out.println("You entered: " + number);
        sc.close();
    }
}

