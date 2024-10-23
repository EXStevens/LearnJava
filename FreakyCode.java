import java.util.Scanner;
import java.util.InputMismatchException;

public class FreakyCode
{ 
   public static void main(String[] args)
   {
    boolean stat = false;
    double sleepingHours = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter your sleeping time in hours! Daddy loves you~");
      try {
          sleepingHours = scanner.nextDouble();
          break; // Exit the loop if input is valid
      } catch (InputMismatchException e) {
          System.out.println("Mischievous behavior will lead to punishments!");
          scanner.next(); // Clear the invalid input
      }
    }

    scanner.close();

    if (sleepingHours >= 8.0) {
      stat = true;
    } else {
      stat = false;
    }
      
    if (stat == false) {
      System.out.printf("Aww naughty boy, you only slept for ");
      System.out.print(sleepingHours);
      System.out.println(" hours.");
      System.out.print("Get back to your bed and resume sleeping till exceeding 8 hours.");
    } else {
      System.out.printf("That's daddy's good boy. Let's play! :)");
    }
   } 
}