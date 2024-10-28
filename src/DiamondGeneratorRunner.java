import java.util.Scanner;
public class DiamondGeneratorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the diamond: ");
        int sideLength = scanner.nextInt();

        DiamondGenerator.generateUpperDiamond(sideLength);
        DiamondGenerator.generateLowerDiamond(sideLength);
    }
}
