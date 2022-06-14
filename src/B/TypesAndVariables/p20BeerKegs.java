package B.TypesAndVariables;

import java.util.Scanner;

public class p20BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        double volumeLeg = 0;
        String bigKeg = "";
        for (int i = 1; i <= num; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int high = Integer.parseInt(scanner.nextLine());
            double currentLeg = 0;
            // π * r^2 * h
            currentLeg = Math.PI * Math.pow(radius, 2) * high;
            if (currentLeg > volumeLeg) {
                volumeLeg = currentLeg;
                bigKeg = kegModel;
            }
        }
        System.out.printf("%s", bigKeg);
    }
}
