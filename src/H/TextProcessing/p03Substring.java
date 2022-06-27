package H.TextProcessing;

import java.util.Scanner;

public class p03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyWord = scanner.nextLine();
        String word = scanner.nextLine();
        while(word.indexOf(keyWord) != -1){
            word = word.replaceAll(keyWord, "");
        }
        System.out.println(word);
    }
}
