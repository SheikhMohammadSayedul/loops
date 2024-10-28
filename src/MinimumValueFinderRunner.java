import java.util.Scanner;
public class MinimumValueFinderRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinimumValueFinder finder = new MinimumValueFinder();
        System.out.println("Enter a series of numbers, separated by spaces (non-number to stop):");


        double minimum = finder.findMinimum(scanner);
        scanner.close();
        System.out.println("The minimum value is: " + minimum);
    }
}

