package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p13EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        int magicIndex = 0;
        boolean isFound = false;
        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < line.length; i++) {
            magicIndex = i;
            for (int j = i + 1; j < line.length; j++) {
                rightSum += line[j];
            }
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    leftSum += line[j];
                }
            }

            if (leftSum == rightSum) {
                isFound = true;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }
        if (isFound) {
            System.out.println(magicIndex);
        } else {
            System.out.println("no");
        }
    }
}
