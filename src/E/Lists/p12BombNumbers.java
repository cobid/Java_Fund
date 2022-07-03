package E.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p12BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newNumber = new ArrayList<>();

        String[] specialAndPower = scanner.nextLine().split("\\s+");

        int special = Integer.parseInt(specialAndPower[0]);
        int power = Integer.parseInt(specialAndPower[1]);


        if (power == 0) {
            numbers.removeAll(Arrays.asList(special));
            return;
        }
        int index = numbers.indexOf(special);
        for (int i = index; i >= power; i--) {
            numbers.remove(i - 1);

        }
        for (int i = index; i <= power; i++) {
            numbers.remove(i);

        }







        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
    }
}



