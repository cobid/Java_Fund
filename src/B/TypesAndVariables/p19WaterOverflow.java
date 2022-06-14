package B.TypesAndVariables;

import java.util.Scanner;

public class p19WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sumLiters = 0;
        for (int i = 1; i <= num; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (sumLiters + liters > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            sumLiters += liters;
        }
        System.out.println(sumLiters);
    }
}
