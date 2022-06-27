package E.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class p11ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] operation = line.split("\\s+");

            if (operation[0].equals("Add") || operation[0].equals("Insert") || operation[0].equals("Remove")) {
                int number = Integer.parseInt(operation[1]);
                if (operation[0].equals("Add")) {
                    list.add(list.size(), number);
                }
                if (operation[0].equals("Insert")) {
                    int index = Integer.parseInt(operation[2]);
                    if (index > list.size() - 1 || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(index, number);
                    }
                } else if (operation[0].equals("Remove")) {
                    if (number > list.size() - 1 || number < 0) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(number);
                    }
                }
            }
            if (operation[0].equals("Shift")) {
                int count = Integer.parseInt(operation[2]);
                if (operation[1].equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int firstNumber = list.get(0);
                        list.add(firstNumber);
                        list.remove(0);
                    }
                } else if (operation[1].equals("right")) {
                    for (int i = 0; i < count; i++) {
                        int lastNumber = list.get(list.size() - 1);
                        list.add(0, lastNumber);
                        list.remove(list.size() - 1);
                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
