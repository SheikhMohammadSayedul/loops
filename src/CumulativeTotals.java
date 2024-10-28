import java.util.Scanner;
public class CumulativeTotals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine().trim();
        String[] numbers = input.split("\\s+");
        int[] cumulativeTotals = new int[numbers.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            sum += num;
            cumulativeTotals[i] = sum;
        }
        System.out.print("Cumulative totals: ");
        for (int i = 0; i < cumulativeTotals.length; i++) {
            System.out.print(cumulativeTotals[i] + " ");
        }
        scanner.close();
    }
}

