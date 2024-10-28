import java.util.Scanner;
public class CurrencyConverterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's exchange rate (1 USD to JPY): ");
        double exchangeRate = scanner.nextDouble();
        CurrencyConverter converter = new CurrencyConverter(exchangeRate);
        converter.convertUSDToJPY();
    }
}

