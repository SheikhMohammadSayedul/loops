import java.util.Scanner;
public class CurrencyConverter {
    private double exchangeRate; // Exchange rate from USD to JPY

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public void convertUSDToJPY() {
        Scanner scanner = new Scanner(System.in);
        double usdValue;
        do {
            System.out.print("Enter a dollar value (or enter 0 to quit): ");
            usdValue = scanner.nextDouble();
            if (usdValue != 0) {
                double yenValue = usdValue * exchangeRate;
                System.out.printf("%.2f USD = %.2f JPY%n", usdValue, yenValue);
            }
        } while (usdValue != 0);

        System.out.println("Conversion finished.");
    }
}

