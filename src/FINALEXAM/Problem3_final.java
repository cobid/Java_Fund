package FINALEXAM;

import java.util.*;

public class Problem3_final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> guestList = new LinkedHashMap<>();
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("Stop")) {
            String[] commandArr = input.split("-");
            String command = commandArr[0];
            String name = commandArr[1];
            String meal = commandArr[2];
            switch (command) {
                case "Like":
                    if (!guestList.containsKey(name)) {
                        guestList.put(name, new ArrayList<>());
                        guestList.get(name).add(meal);
                    } else {
                        if (!guestList.get(name).contains(meal)) {
                            guestList.get(name).add(meal);
                        }
                    }
                    break;
                case "Dislike":
                    if (!guestList.containsKey(name)) {
                        System.out.printf("%s is not at the party.%n", name);
                    } else {
                        if (!guestList.get(name).contains(meal)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", name, meal);
                        } else {
                            guestList.get(name).remove(meal);
                            count++;
                            System.out.printf("%s doesn't like the %s.%n", name, meal);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        guestList.forEach((k,v ) -> {
            System.out.printf("%s: ", k);
            if(v.size()== 0){
                System.out.println();
            } else {
                for (int i = 0; i < v.size(); i++) {
                    if (i != v.size() - 1) {
                        System.out.printf("%s, ", v.get(i));
                    } else {
                        System.out.printf("%s%n", v.get(i));
                    }
                }
            }
        });
        System.out.printf("Unliked meals: %d", count);
    }
}

