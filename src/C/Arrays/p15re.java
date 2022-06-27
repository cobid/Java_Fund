package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p15re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();

        int[] longLine = new int[4];
        int maxLine = 0;
        int number = 0;
        int newNumbers = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] == numbers[i + 1]) {
                System.out.println(longLine[i]);
                number = numbers[i];
            }if (newNumbers>number){

            }
        }
        //for (int i = 0; i < max ; i++) {
        // System.out.print(currentElement + " ");
    }
}
