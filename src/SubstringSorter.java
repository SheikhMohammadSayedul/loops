import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SubstringSorter {
    public ArrayList<String> getAllSubstrings(String word) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }
        Collections.sort(substrings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        return substrings;
    }
}
