import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        sc.close();

        // Check if the date is in Spring Season
        if ((month == 3 && day >= 20 && day <= 31) || // March 20-31
            (month == 4 && day >= 1 && day <= 30) ||  // April 1-30
            (month == 5 && day >= 1 && day <= 31) ||  // May 1-31
            (month == 6 && day >= 1 && day <= 20)) {  // June 1-20
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
