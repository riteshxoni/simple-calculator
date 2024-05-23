import java.util.InputMismatchException;
import java.util.Scanner;

// Main class for the Calculator program
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner object for user input
        Calc obj = new Calc(); // Create an instance of the Calc class

        // Infinite loop to display the menu and perform operations
        while (true) {
            try {
                // Display the menu options
                System.out.println("1. > Addition\n2. > Subtraction");
                System.out.print("3. > Multiplication\n4. > Division\n5. > Exit\nChoice : ");
                int ch = sc.nextInt(); // Read the user's choice
                
                // Perform the selected operation
                if (ch == 1)
                    obj.add(); // Call the add method
                else if (ch == 2)
                    obj.sub(); // Call the sub method
                else if (ch == 3)
                    obj.mul(); // Call the mul method
                else if (ch == 4)
                    obj.div(); // Call the div method
                else {
                    // Exit the program
                    System.out.println("Thank you for using the calculator.");
                    return;
                }
            } catch (InputMismatchException e) {
                // Handle invalid input
                System.out.println("Invalid input...\nExiting.....");
                return;
            }
        }
    }
}

// Class containing the calculator operations
class Calc {
    double a, b, result; // Variables to store operands and result

    // Method to get input from the user
    void getdata() {
        Scanner sc = new Scanner(System.in); // Scanner object for user input
        try {
            // Prompt the user to enter the first number
            System.out.print("Enter First Number : ");
            a = sc.nextDouble();

            // Prompt the user to enter the second number
            System.out.print("Enter Second Number : ");
            b = sc.nextDouble();
        } catch (InputMismatchException e) {
            // Handle invalid input
            System.out.println("Invalid input, please enter numeric values.");
            getdata(); // Recursive call to getdata to prompt the user again
        }
    }

    // Method for addition
    void add() {
        getdata(); // Get input from the user
        result = a + b; // Perform addition
        System.out.println("Addition = " + result); // Display the result
    }

    // Method for subtraction
    void sub() {
        getdata(); // Get input from the user
        result = a - b; // Perform subtraction
        System.out.println("Subtraction = " + result); // Display the result
    }

    // Method for multiplication
    void mul() {
        getdata(); // Get input from the user
        result = a * b; // Perform multiplication
        System.out.println("Multiplication = " + result); // Display the result
    }

    // Method for division
    void div() {
        getdata(); // Get input from the user
        if (b != 0) { // Check for division by zero
            result = a / b; // Perform division
            System.out.println("Division = " + result); // Display the result
        } else {
            // Handle division by zero
            System.out.println("Division by zero is not allowed.");
        }
    }
}