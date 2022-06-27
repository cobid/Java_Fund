package E.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class p4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String lines = scanner.nextLine();
        while (!lines.equals("end")) {
            List<String> line = Arrays.stream(lines.split(" ")).collect(Collectors.toList());

            manipulateList(list, line);
            lines = scanner.nextLine();
        }

        for (String number : list) {
            System.out.print(number + " ");
        }

    }

    private static void manipulateList(List<String> list, List<String> line) {

        String command = line.get(0);
        switch (command) {
            case "Add":
                String element = line.get(1);
                list.add(element);
                break;
            case "Remove":
                element = line.get(1);
                if(list.contains(element)) {
                    list.remove(element);
                }
                break;

            case "RemoveAt":
                int indexCommand = Integer.parseInt(line.get(1));
                if (indexCommand <= list.size() - 1) {
                    list.remove(indexCommand);
                }
                break;
            case "Insert":
                element = line.get(1);
                indexCommand = Integer.parseInt(line.get(2));
                if (indexCommand <= list.size() - 1) {
                    list.add(indexCommand, element);
                }
                break;
        }
    }
}

