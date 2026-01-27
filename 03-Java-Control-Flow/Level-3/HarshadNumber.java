import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Find sum of digits using while loop
        while (originalNumber != 0) {

            // Step 4: Get last digit
            int digit = originalNumber % 10;

            // Step 5: Add digit to sum
            sum = sum + digit;

            // Step 6: Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Step 7: Check Harshad condition
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
