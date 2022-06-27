package E.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p10HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] guestName = scanner.nextLine().split(" ");
            String status = guestName[2];
            String name = guestName[0];
            if (status.equals("going!")) {
                if( list.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    list.add(name);
                }
            } else if (status.equals("not")) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String guest : list) {
            System.out.println(guest);
        }
    }
}
