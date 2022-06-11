package B.TypesAndVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class p02PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal pounds = new BigDecimal(scanner.nextLine());
        pounds = pounds.multiply(BigDecimal.valueOf(1.36));

        System.out.printf("%.3f", pounds);




    }
}
