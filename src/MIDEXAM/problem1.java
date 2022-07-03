package MIDEXAM;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceSingleEgg = Double.parseDouble(scanner.nextLine());
        double priceSingleApron = Double.parseDouble(scanner.nextLine());
        int freePackages = getStudents(students);

        double apronPrice = priceSingleApron * Math.ceil(students * 1.2);
        double eggPrice = students * (10 * priceSingleEgg);
        double flourPrice = (students * priceFlour) - (freePackages * priceFlour);
        double totalBudget = apronPrice + eggPrice + flourPrice;
        if (budget >= totalBudget) {
            System.out.printf("Items purchased for %.2f$.", totalBudget);
        } else {
            System.out.printf("%.2f$ more needed.", totalBudget - budget);
        }
    }
    private static int getStudents(int students) {
        int freePackage = 0;
        if (students >= 5) {
            freePackage =  students / 5;
        }
      return freePackage;
    }
}
