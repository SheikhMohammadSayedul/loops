import java.util.Scanner;
public class BinaryDigitPrinter {
    public void printBinaryDigits(int number) {
        if (number == 0) {
            System.out.print("0");
            return;
        }
        StringBuilder binaryRepresentation = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            binaryRepresentation.insert(0, remainder); // Insert remainder at the beginning
            number = number / 2;
        }
        System.out.println(binaryRepresentation.toString());
    }
}

