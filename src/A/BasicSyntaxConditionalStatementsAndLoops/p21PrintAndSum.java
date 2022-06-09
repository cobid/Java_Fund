package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p21PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int totSum = 0;
        for (int i = start; i <= end; i++) {
            totSum += i;
            System.out.print(i+" ");
        }
        System.out.printf("%nSum: %d", totSum);


    }
}
