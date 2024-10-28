import java.util.Scanner;
public class BinaryDigitPrinterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        BinaryDigitPrinter printer = new BinaryDigitPrinter();
        printer.printBinaryDigits(number);

        scanner.close();
    }
}

