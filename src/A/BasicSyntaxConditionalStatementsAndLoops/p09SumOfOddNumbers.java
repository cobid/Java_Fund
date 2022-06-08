package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int countNum = 1;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 && countNum <= num) {
                System.out.println(i);
                sum += i;
                countNum++;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
