package B.TypesAndVariables;

import java.util.Scanner;

public class p15Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        double countElevate = 0;
        countElevate = Math.ceil(n/p);
        System.out.printf("%.0f", countElevate);
    }
}
