import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine().trim();

        // Split the input string into array of strings
        String[] numbers = input.split("\\s+");

        // Create a list to store adjacent duplicates
        List<Integer> adjacentDuplicates = new ArrayList<>();

        // Iterate through the array to find adjacent duplicates
        for (int i = 1; i < numbers.length; i++) {
            int current = Integer.parseInt(numbers[i]);
            int previous = Integer.parseInt(numbers[i - 1]);

            if (current == previous) {
                if (!adjacentDuplicates.contains(current)) {
                    adjacentDuplicates.add(current);
                }
            }
        }

        // Print the adjacent duplicates
        System.out.print("Adjacent duplicates: ");
        for (int i = 0; i < adjacentDuplicates.size(); i++) {
            System.out.print(adjacentDuplicates.get(i) + " ");
        }

        scanner.close();
    }
}

