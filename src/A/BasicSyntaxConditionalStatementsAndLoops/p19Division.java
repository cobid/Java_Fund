package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p19Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int newNum = 0;
        boolean isDivisible = true;
        if (num % 10 == 0) {
            newNum = 10;
        } else if (num % 7 == 0) {
            newNum = 7;
        } else if (num % 6 == 0) {
            newNum = 6;
        } else if (num % 3 == 0) {
            newNum = 3;
        } else if (num % 2 == 0) {
            newNum = 2;
        } else {
            isDivisible = false;
        }
        if (isDivisible){
            System.out.printf("The number is divisible by %d", newNum);;
        }else{
            System.out.println("Not divisible");
        }
    }
}
