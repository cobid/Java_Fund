package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class p1CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numbersMap = new TreeMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            double currentNum = numbers.get(i);

            if (numbersMap.containsKey(currentNum)) {
                numbersMap.put(currentNum, numbersMap.get(currentNum) + 1);
            } else {
                numbersMap.put(currentNum, 1);
            }

        }
        for (Map.Entry<Double, Integer> doubleIntegerEntry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %s%n", doubleIntegerEntry.getKey(), doubleIntegerEntry.getValue());
        }

    }
}
