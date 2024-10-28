import java.util.Scanner;
public class EverySecondLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Close the scanner
        scanner.close();
        // Initialize a StringBuilder to collect every second letter
        StringBuilder secondLetters = new StringBuilder();
        // Iterate through each character in the string, starting from the second character (index 1)
        for (int i = 1; i < input.length(); i += 2) {
            secondLetters.append(input.charAt(i));
        }
        // Print every second letter found
        System.out.println("Every second letter in the string: " + secondLetters.toString());
    }
}

