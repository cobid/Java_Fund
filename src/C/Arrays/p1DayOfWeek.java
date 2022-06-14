package C.Arrays;

import java.util.Scanner;

public class p1DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String day[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (num <= 0 || num > day.length) {
            System.out.println("Invalid day!");
        } else if (num <= day.length) {
            System.out.println(day[num - 1]);
        }
    }
}
