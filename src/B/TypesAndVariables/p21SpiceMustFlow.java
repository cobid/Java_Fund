package B.TypesAndVariables;

import java.util.Scanner;

public class p21SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mine = Integer.parseInt(scanner.nextLine());

        int harvest = 0;
        int days = 0;
        if (mine < 100) {
            System.out.println(0);
            System.out.println(0);
        } else {
            while (mine >= 100) {
                days++;
                harvest += mine;
                mine -= 10;
                harvest -= 26;
            }
            harvest -= 26;

            System.out.println(days);
            System.out.println(harvest);
        }
    }
}