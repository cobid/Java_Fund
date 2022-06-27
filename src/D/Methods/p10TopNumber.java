package D.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class p10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if(divideBy(i, 8) && hasOddNumber(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean divideBy(int number, int divideNumber) {
        int result = number;
        int sum = 0;
        while(result > 0){
            sum += result % 10;
            result /= 10;
        }
        if(sum % divideNumber == 0){
            return true;
        }
        return false;
    }
    private static boolean hasOddNumber(int number){
        int result = number;
        int currentNumber = 0;
        while(result > 0){
            currentNumber = result % 10;
            if(currentNumber % 2 != 0){
                return true;
            }
            result /= 10;
        }
        return false;
    }
}
