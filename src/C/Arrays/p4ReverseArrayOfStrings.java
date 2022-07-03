package C.Arrays;

import java.util.Scanner;

public class p4ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length / 2; i++) {
            String oldLine = line[i];

            line[i] = line[line.length - 1 - i];//
            line[line.length - 1 - i] = oldLine;

        }
        System.out.println(String.join(" ", line));


    }
}
