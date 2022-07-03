package MIDEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!line.equals("Finish")) {
            List<String> commands = Arrays.stream(line.split(" ")).collect(Collectors.toList());
            String command = commands.get(0).trim();
            int number = Integer.parseInt(commands.get(1).trim());

            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    if (numbers.contains(number)) {
                        int removeIndex = numbers.indexOf(number);
                        numbers.remove(removeIndex);
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(commands.get(2).trim());
                    replaceValues(numbers, number, replacement);
                    break;
                case "Collapse":
                    removeLessThan(numbers, number);
                    break;
            }
            line = scanner.nextLine();
        }
        printNumbers(numbers);
    }
    public static void replaceValues(List<Integer> numbers, int number, int replacement) {
        if (numbers.contains(number)) {
            int valueForMoveIndex1 = numbers.indexOf(number);
            numbers.set(valueForMoveIndex1, replacement);
        }
    }
    public static void removeLessThan(List<Integer> numbers, int number) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (number > numbers.get(i)) {
                numbers.remove(i);
            }
        }
    }
    public static void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + " ");
            } else {
                System.out.println(numbers.get(i));
            }
        }

    }
}
