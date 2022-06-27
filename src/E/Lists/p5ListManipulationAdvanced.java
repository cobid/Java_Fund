package E.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] commands = line.split(" ");
            String command = commands[0];
            switch (command) {
                case "Contains":
                    int numberEqual = Integer.parseInt(commands[1]);
                    if (list.contains(numberEqual)) {
                        System.out.print("Yes");
                        System.out.println();
                    } else {
                        System.out.print("No such number");
                        System.out.println();
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        printEven(list);
                        System.out.println();
                    } else if (commands[1].equals("odd")) {
                        printOdd(list);
                        System.out.println();
                    }
                    break;
                case "Filter":
                    String sign = commands[1];
                    int number = Integer.parseInt(commands[2]);
                    filter(list, sign, number);
                    break;
                case "Get":
                    int getSum = getSum(list);
                    System.out.println(getSum);
            }
        }
    }
    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
    private static void printEven(List<Integer> list) {
        for (Integer number : list) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

    private static void printOdd(List<Integer> list) {
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
    private static void filter(List<Integer> list, String sign, Integer number) {
        if (sign.equals("<")) {
            for (int num : list) {
                if (num < number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        } else if (sign.equals(">")) {
            for (int num : list) {
                if (num > number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        } else if (sign.equals(">=")) {
            for (int num : list) {
                if (num >= number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        } else if (sign.equals("<=")) {
            for (int num : list) {
                if (num <= number) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}



