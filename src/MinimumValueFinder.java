import java.util.Scanner;
public class MinimumValueFinder {
    public double findMinimum(Scanner scanner) {
        boolean first = true;
        double minimum = 0;
        while (scanner.hasNextDouble()) {

            double value = scanner.nextDouble();
            if (first) {
                minimum = value;
                first = false;
            } else if (value < minimum) {
                minimum = value;
            }
        }
        return minimum;
    }
}

