package F.ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class p3BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        BigInteger fact = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }


        System.out.println(fact);
    }

}

