package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p10ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstLine = new String[n];
        String[] secondLine = new String[n];
        for (int i = 0; i < n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstLine[i] = numbers[0];
                secondLine[i] = numbers[1];
            }
            if (i % 2 == 1) {
                firstLine[i] = numbers[1];
                secondLine[i] = numbers[0];
            }
        }
        System.out.println(String.join(" ", firstLine));
        System.out.println(String.join(" ", secondLine));
    }
}
