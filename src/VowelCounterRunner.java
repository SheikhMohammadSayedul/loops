import java.util.Scanner;
public class VowelCounterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        VowelCounter counter = new VowelCounter();
        int numOfVowels = counter.countVowels(word);
        System.out.println(numOfVowels + " vowels");

        scanner.close();
    }
}

