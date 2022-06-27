package H.TextProcessing;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class p06ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(", ")).filter(a-> a.matches("^[A-Za-z\\d_-]{3,16}$")).forEach(System.out::println);
    }
}


