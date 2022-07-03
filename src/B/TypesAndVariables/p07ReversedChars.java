package B.TypesAndVariables;

import java.util.Scanner;

public class p07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        System.out.printf("%s %s %s", thirdChar, secondChar, firstChar);
    }
}
