package B.TypesAndVariables;

import java.util.Scanner;

public class p17PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = startNum; i <= secondNum; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");


        }
    }
}
