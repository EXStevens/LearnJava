import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int int0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the # you desire in a Fibonacci Sequence:");
            try {
                int0 = scanner.nextInt();
                if (int0 < 1) {
                    System.out.println("Not an integer that is greater than 0, try again.");
                    continue; // No need to call scanner.next() here since nextInt() will handle it
                } else {
                    break; // Exit the loop if input is valid
                }
            } catch (InputMismatchException e) {
                System.out.println("Not an integer, try again.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();

        int fibonacciValue = fibonacci(int0);
        System.out.println("Fibonacci value at position " + int0 + " is: " + fibonacciValue);
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0; // Handle edge case
        if (n == 1) return 1; // Base case for n = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
    
}
