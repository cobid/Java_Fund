package C.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p9CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOne = scanner.nextLine().split(" ");
        String[] lineTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < lineTwo.length; i++) {
            for (int j = 0; j < lineOne.length; j++) {
                if (lineTwo[i].equals(lineOne[j])) {
                    System.out.print(lineTwo[i]+" ");
                    break;
                }
            }
        }
    }
}
