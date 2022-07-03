package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p03PassedorFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();

        if(grade >=3.00 ){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }


    }
}
