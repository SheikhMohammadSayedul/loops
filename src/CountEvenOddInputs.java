import java.util.Scanner;
public class CountEvenOddInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even inputs: " + evenCount);
        System.out.println("Number of odd inputs: " + oddCount);

        scanner.close();
    }
}

