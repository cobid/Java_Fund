package H.TextProcessing;

import java.util.Scanner;

public class p04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(", ");

        StringBuffer text = new StringBuffer(scanner.nextLine());

        for (String word : wordsArr) {
            while (text.indexOf(word) != -1) {
                int startIndex = text.indexOf(word);
                int endIndex = startIndex + word.toCharArray().length;
                String replacement = replacementString(word);
                    text = text.replace(startIndex, endIndex, replacement);
            }
        }
        System.out.println(text);

   }
    public static String replacementString(String input) {
        String replacementString = "";
        for (int i = 0; i < input.toCharArray().length; i++) {
            replacementString = replacementString.concat("*");
        }
        return replacementString;
    }
}
