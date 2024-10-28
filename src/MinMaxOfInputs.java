import java.util.Scanner;

public class MinMaxOfInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Initialize variables for min and max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Loop to input numbers and find min and max
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Output the smallest and largest numbers
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);

        scanner.close();
    }
}


