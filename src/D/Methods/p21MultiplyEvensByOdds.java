package D.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class p21MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = Integer.parseInt(scanner.nextLine());
        int result = getMultiple(line);
        System.out.print(Math.abs(result));
    }
    private static int getMultiple(int input) {
        return getOddSum(input) * getEvenSum(input);
    }
    private static int getOddSum(int input) {
        input = Math.abs(input);
        String stringInput = Integer.toString(input);
        int[] lineOfNumbers = Arrays.stream(stringInput.toString().split("")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int oddSum = 0;
        for (int i = 0; i < lineOfNumbers.length ; i++) {
            if (i % 2 == 1) {
                oddSum += lineOfNumbers[i];
            }
        }
        return oddSum;
    }

    private static int getEvenSum(int input) {
        input = Math.abs(input);
        String stringInput = Integer.toString(input);
        int[] lineOfNumbers = Arrays.stream(stringInput.toString().split("")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int evenSum = 0;
        for (int i = 0; i < lineOfNumbers.length ; i++) {
            if (i % 2 != 1) {
                evenSum += lineOfNumbers[i];
            }
        }
        return evenSum;
    }
}
