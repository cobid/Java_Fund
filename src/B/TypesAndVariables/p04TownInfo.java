package B.TypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class p04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int square = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", town, population, square);
    }
}
