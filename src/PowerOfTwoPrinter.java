import java.math.BigInteger;
public class PowerOfTwoPrinter {
    public void printPowersOfTwo() {
        BigInteger two = new BigInteger("2");
        BigInteger result = two.pow(20);

        for (int i = 20; i <= 220; i++) {
            System.out.println("2^" + i + " = " + result);
            result = result.multiply(two);
        }
    }
}


