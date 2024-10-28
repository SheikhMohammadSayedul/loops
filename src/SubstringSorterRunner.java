import java.util.ArrayList;
import java.util.Scanner;
public class SubstringSorterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        SubstringSorter sorter = new SubstringSorter();
        ArrayList<String> substrings = sorter.getAllSubstrings(word);
        for (String substring : substrings) {
            System.out.println(substring);
        }
        scanner.close();
    }
}

