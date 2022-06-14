package FINALEXAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    static class Food {

        String name;
        String date;
        int calories;

        private Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("([#\\|])(?<food>[A-Z][a-z]+\\s*[A-Z]?[a-z]*)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
            Matcher matcher = pattern.matcher(input);
            int totalCal = 0;
            List<Food> foods = new ArrayList<>();

            while (matcher.find()) {
                foods.add(new Food(matcher.group("food"), matcher.group("date"), Integer.parseInt(matcher.group("calories"))));
                totalCal += Integer.parseInt(matcher.group("calories"));
            }

            int days = totalCal / 2000;
            System.out.printf("You have food to last you for: %d days!%n", days);

            foods.forEach(
                    food -> {
                        System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", food.name, food.date, food.calories);
                    }
            );
        }
    }





