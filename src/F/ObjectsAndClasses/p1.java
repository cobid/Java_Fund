package F.ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            int x = random.nextInt(words.length);
            int y = random.nextInt(words.length);

            String oldWord = words[x];
            words[x] = words[y];
            words[y] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
