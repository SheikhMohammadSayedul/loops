import java.util.Scanner;
public class VowelPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();
        String vowels = "AEIOUaeiou";
        StringBuilder positions = new StringBuilder();
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                positions.append(i + 1).append(" ");
            }
        }
        System.out.println("Positions of vowels in the string: " + positions.toString().trim());
    }
}

