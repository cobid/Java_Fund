package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p13RefactorSumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(2 * i + 1);
            if (i < num - 1) {
                sum += 2 * i + 1;
            } else {
                sum += 2 * i;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
