import java.util.Scanner;
public class ReverseWordPrinterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        ReverseWordPrinter printer = new ReverseWordPrinter();
        printer.printReverse(word);
        scanner.close();
    }
}
