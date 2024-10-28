import java.util.Scanner;
public class ModifiedDiamondGeneratorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the modified diamond: ");
        int sideLength = scanner.nextInt();

        ModifiedDiamondGenerator.generateUpperModifiedDiamond(sideLength);
        ModifiedDiamondGenerator.generateLowerModifiedDiamond(sideLength);
    }
}
