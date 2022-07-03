package E.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p8Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scanner.nextLine());


        String line = scanner.nextLine();
        while (true) {
            String[] commands = line.split(" ");
            String command = commands[0];

            if (command.equals("end")) {
                break;
            }
            if (command.equals("Add")) {
                int addWagons = Integer.parseInt(commands[1]);
                wagons.add(wagons.size(), addWagons);

            } else {
                int addPassengers = Integer.parseInt(commands[0]);
                for (int i = 0; i < wagons.size() ; i++) {
                    int currentPassengers = wagons.get(i) + addPassengers;
                    if (currentPassengers <= maxPassengers) {
                        wagons.set(i, currentPassengers);
                        break;
                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}

