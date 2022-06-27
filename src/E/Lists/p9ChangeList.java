package E.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class p9ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String line = scanner.nextLine();
        while (true){
            String[] operation = line.split(" ");
            String command = operation[0];
            if (command.equals("end")) {
                break;
            }
            int num = Integer.parseInt(operation[1]);
            switch (operation[0]){
                case "Delete":
                    Collection<Integer> collection = new ArrayList<Integer>();
                    collection.add(num);
                    nums.removeAll(collection);
                    break;
                case "Insert":
                    int index = Integer.parseInt(operation[2]);
                    nums.add(index, num);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}
