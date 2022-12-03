/*
 * This program gives the factorial of the given input
 *
 * @author  Seti Ngabo
 * @version 11.0.16
 * @since   2022-11-09
 */

import java.util.Scanner;

/**
 * Main class.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The reverseString function.
     *
     * @param accepts a string
     * @return factorial value of num
     */
    public static int factorial(int num) {
        final int firstInt;

        if (num < 0) {
            firstInt = -1;
        } else if (num == 0) {
            firstInt = 1;
        } else {
            firstInt = factorial(num - 1) * num;
        }

        return firstInt;
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
  
    public static void main(String[] args) {
    final String userString;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    userString = scan.next();

    System.out.println("");
    try {
      final int userInt = Integer.parseInt(userString);
      if (userInt == 0) {
        System.out.printf("%s! = 1", String.valueOf(userInt));
      } else {
         System.out.printf("%s! = %s", String.valueOf(userInt),
            String.valueOf(factorial(userInt)));
      }
    } catch (Exception e) {
      System.out.println("Invalid input, try again.");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
