import java.util.Scanner;
public class HighestTemperatureMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define an array to hold the temperature values for each month
        double[] temperatures = new double[12];
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        // Read temperature values for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        // Close the scanner
        scanner.close();
        // Find the month with the highest temperature
        int maxIndex = 0;
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > temperatures[maxIndex]) {
                maxIndex = i;
            }
        }
        // Print the month with the highest temperature
        System.out.println("The month with the highest temperature is " + months[maxIndex] +
                " with a temperature of " + temperatures[maxIndex] + " degrees.");
    }
}

