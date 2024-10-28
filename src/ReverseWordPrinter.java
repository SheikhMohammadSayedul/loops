public class ReverseWordPrinter {
    public void printReverse(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        System.out.println(reversedWord.toString());
    }
}

