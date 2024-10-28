public class PowersOfTwo {
    public static void main(String[] args) {
        for (int i = 20; i <= 220; i++) {
            long powerOfTwo = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}

