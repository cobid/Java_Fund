package H.TextProcessing;



import java.util.Scanner;

public class p02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] line = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : line) {
            int count = word.toCharArray().length;
            for (int i = 0; i < count ; i++) {
                sb.append(word);
            }
        }

        System.out.println(sb);


    }
}
