import java.util.Scanner;
public class CurrencyConverterRunner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's exchange rate (1 USD to JPY): ");
        double exchangeRateUSDToJPY = scanner.nextDouble();
        CurrencyConverter2 converter = new CurrencyConverter2(exchangeRateUSDToJPY);

        converter.convertUSDToJPY();
        converter.convertJPYToUSD();
    }
}


