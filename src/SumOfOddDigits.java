import java.util.Scanner;
public class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();
        // Calculate sum of odd digits
        long sum = 0;
        while (number > 0) {
            long digit = number % 10;
            if (digit % 2 != 0) { // Check if digit is odd
                sum += digit;
            }
            number /= 10; // Move to the next digit
        }
        // Output the sum of odd digits
        System.out.println("Sum of odd digits: " + sum);
    }
}

