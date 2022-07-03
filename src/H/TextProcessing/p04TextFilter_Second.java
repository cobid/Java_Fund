package H.TextProcessing;

import java.util.Scanner;

public class p04TextFilter_Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word: wordsArr) {
            String replacement = replacementString(word);
            if(text.indexOf(word) != -1){
                text = text.replaceAll(word, replacement);
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
