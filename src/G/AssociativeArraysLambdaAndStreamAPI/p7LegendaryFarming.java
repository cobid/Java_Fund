package G.AssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class p7LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> gameParts = new LinkedHashMap<>();
        gameParts.put("shards", 0);
        gameParts.put("fragments", 0);
        gameParts.put("motes", 0);
        Map<String, Integer> other = new LinkedHashMap<>();
        boolean isOver = false;

        while (!isOver) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length ; i += 2) {
                int quantity = Integer.parseInt(input[i].trim());
                String material = input[i + 1].toLowerCase().trim();
                if (gameParts.containsKey(material)) {
                    int currentQuantity = gameParts.get(material);
                    gameParts.put(material, currentQuantity + quantity);
                    if (gameParts.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (material.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        gameParts.put(material, gameParts.get(material) - 250);
                        isOver = true;
                        break;
                    }
                } else {
                    if (!other.containsKey(material)) {
                        other.put(material, quantity);
                    } else {
                        int currentQuantity = other.get(material);
                        other.put(material, quantity + currentQuantity);
                    }
                }
            }
        }
        gameParts.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        other.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
