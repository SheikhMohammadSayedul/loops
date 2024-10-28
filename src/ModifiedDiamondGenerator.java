public class ModifiedDiamondGenerator {
    public static void generateUpperModifiedDiamond(int sideLength) {
        for (int i = 1; i <= sideLength - 1; i++) {
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
    public static void generateLowerModifiedDiamond(int sideLength) {
        for (int i = sideLength ; i >= 1; i--) {
            // Print spaces before the first set of asterisks
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

