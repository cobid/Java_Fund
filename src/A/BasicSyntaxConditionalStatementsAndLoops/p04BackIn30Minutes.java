package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int newMin = min + 30;
        if (newMin > 59) {
            hour += 1;
            newMin -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, newMin);
    }
}
