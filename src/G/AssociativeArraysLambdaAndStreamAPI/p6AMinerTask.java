package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class p6AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> inputRead = new ArrayList<>();
        Map<String, Integer> metalMap = new LinkedHashMap<>();


        while (!input.equals("stop")) {
            inputRead.add(input);
            input = scanner.nextLine();
        }
        for (int i = 0; i < inputRead.size() - 1; i += 2) {
            Integer value = Integer.parseInt(inputRead.get(i + 1));

            if (metalMap.containsKey(inputRead.get(i))) {
                metalMap.put(inputRead.get(i), metalMap.get(inputRead.get(i)) + value);
            } else {
                metalMap.put(inputRead.get(i), value);
            }
        }

        for (Map.Entry<String, Integer> resultMap : metalMap.entrySet()) {
            System.out.printf("%s -> %d%n", resultMap.getKey(), resultMap.getValue());
        }
    }
}
