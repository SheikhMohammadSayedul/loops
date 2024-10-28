import java.util.Scanner;
public class WordPrinterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        WordPrinter printer = new WordPrinter();
        printer.printCharacters(word);
        scanner.close();
    }
}
