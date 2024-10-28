import java.util.Scanner;
public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder modifiedString = new StringBuilder(input);
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < modifiedString.length(); i++) {
            char ch = modifiedString.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                // Replace the vowel with an underscore
                modifiedString.setCharAt(i, '_');
            }
        }
        System.out.println("Modified string: " + modifiedString.toString());
    }
}

