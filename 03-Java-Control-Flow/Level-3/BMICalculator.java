import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Step 3: Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Step 4: Determine BMI status
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Step 5: Display result
        System.out.println("\nBMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}
