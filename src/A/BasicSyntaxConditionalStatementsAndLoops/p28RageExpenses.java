package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p28RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   • On the first input line - lost games count – integer in the range [0, 1000].
        // • On the second line – headset price - the floating-point number in the range [0, 1000].
        // • On the third line – mouse price - the floating-point number in the range [0, 1000].
        // • On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        // • On the fifth line – display price - the floating-point number in the range [0, 1000].
        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int countTrashes = 0;

        double expenses = 0.0;
        for (int i = 1; i <= lostGame; i++) {
            countTrashes++;
            if (countTrashes % 2 == 0) {
                expenses += headsetPrice;
            }
            if (countTrashes % 3 == 0) {
                expenses += mousePrice;
            }
            if (countTrashes % 6 == 0) {
                expenses += keyboardPrice;
            }
            if (countTrashes % 12 == 0) {
                expenses += displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
