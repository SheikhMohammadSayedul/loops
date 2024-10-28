public class DiamondGenerator {
    public static void generateUpperDiamond(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
    public static void generateLowerDiamond(int sideLength) {
        for (int i = sideLength - 1; i >= 1; i--) {
            // Print spaces before the asterisks
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
