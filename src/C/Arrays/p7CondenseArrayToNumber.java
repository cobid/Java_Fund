package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        if(numbers.length == 1){
            sum = numbers[0];
        }
        int x = numbers.length - 1;
        while (x >= 1) {

            int[] condensed = new int[x];

            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            if(condensed.length > 1) {
                numbers = new int[condensed.length];
                for (int i = 0; i < condensed.length; i++) {
                    numbers[i] = condensed[i];
                }
            }
            sum = condensed[0];
            x--;
        }
        System.out.printf("%d", sum);
    }
}

