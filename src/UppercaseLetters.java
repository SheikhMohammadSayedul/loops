import java.util.Scanner;
public class UppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder uppercaseLetters = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseLetters.append(ch);
            }
        }
        System.out.println("Uppercase letters in the string: " + uppercaseLetters.toString());
    }
}

