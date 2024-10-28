public class VowelCounter {
    public int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouyAEIOUY"; // Including uppercase vowels
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

