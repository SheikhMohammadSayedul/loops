import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();
        System.out.println("Enter a set of floating-point values, separated by spaces:");
        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            dataSet.add(value);
        }
        scanner.close();
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());
    }
}
