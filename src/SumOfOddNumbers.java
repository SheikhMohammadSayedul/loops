import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        scanner.close();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // Initialize sum
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        // Output the sum of odd numbers
        System.out.println("Sum of odd numbers between " + a + " and " + b + " (inclusive) is: " + sum);
    }
}

