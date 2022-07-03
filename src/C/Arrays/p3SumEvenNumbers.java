package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p3SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
