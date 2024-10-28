import java.util.Scanner;

public class CurrencyConverter2 {

    private double exchangeRateUSDToJPY;
    public CurrencyConverter2(double exchangeRateUSDToJPY) {
        this.exchangeRateUSDToJPY = exchangeRateUSDToJPY;
    }
    public void convertUSDToJPY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert USD to JPY:");
        double usdValue;
        do {
            System.out.print("Enter a dollar value (or enter 0 to quit): ");
            usdValue = scanner.nextDouble();

            if (usdValue != 0) {
                double yenValue = usdValue * exchangeRateUSDToJPY;
                System.out.printf("%.2f USD = %.2f JPY%n", usdValue, yenValue);
            }
        } while (usdValue != 0);

        System.out.println("USD to JPY conversion finished.");
    }

    public void convertJPYToUSD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nConvert JPY to USD:");
        double yenValue;
        do {
            System.out.print("Enter a yen value (or enter 0 to quit): ");
            yenValue = scanner.nextDouble();

            if (yenValue != 0) {
                double usdValue = yenValue / exchangeRateUSDToJPY;
                System.out.printf("%.2f JPY = %.2f USD%n", yenValue, usdValue);
            }
        } while (yenValue != 0);

        System.out.println("JPY to USD conversion finished.");
    }
}

