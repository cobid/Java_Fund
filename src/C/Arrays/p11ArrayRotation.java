package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p11ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int firstNum = 0;
        for (int i = 0; i < n; i++) {
            firstNum = line[0];
            for (int j = 0; j < line.length - 1; j++) {
                line[j] = line[j + 1];
            }
            line[line.length - 1] = firstNum;
        }
        for (int i = 0; i < line.length; i++) {
            System.out.print(line[i] + " ");
        }
    }
}
