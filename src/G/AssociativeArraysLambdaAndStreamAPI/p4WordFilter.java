package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class p4WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for(String word : wordsArr){
            System.out.println(word);
        }

    }
}
