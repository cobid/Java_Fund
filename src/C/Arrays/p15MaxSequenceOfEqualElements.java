package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p15MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
        int currentLine = 1;
        int maxLine = 0;
        int bestNumber = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                currentLine++;

            } else {
                currentLine = 1;
            }

            if (currentLine > maxLine) {
                maxLine = currentLine;
                bestNumber = numbers[i];

            }
        }
        for (int i = 0; i < maxLine; i++) {
            System.out.print(bestNumber + " ");
        }
    }
}

