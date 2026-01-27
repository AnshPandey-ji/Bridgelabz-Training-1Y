import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        // Part 1: Using multiple if-else
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
        // Part 2: Using only one if with logical operators
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else if (year >= 1582) {
            System.out.println("Not a Leap Year");
        }
    }
}
