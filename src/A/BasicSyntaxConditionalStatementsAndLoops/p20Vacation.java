package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p20Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;
        double totPrce = 0.0;

        switch (day) {
            case "Friday":
                if (group.equals("Students")) {
                    price = 8.45;
                    totPrce = num * price;
                } else if (group.equals("Business")) {
                    price = 10.90;
                    totPrce = num * price;
                    if (num >= 100) {
                        totPrce = (num - 10) * price;
                    }
                } else if (group.equals("Regular")) {
                    price = 15;
                    totPrce = num * price;
                }
                break;
            case "Saturday":
                if (group.equals("Students")) {
                    price = 9.80;
                    totPrce = num * price;
                } else if (group.equals("Business")) {
                    price = 15.60;
                    totPrce = num * price;
                    if (num >= 100) {
                        totPrce = (num - 10) * price;
                    }
                } else if (group.equals("Regular")) {
                    price = 20;
                    totPrce = num * price;
                }
                break;
            case "Sunday":
                if (group.equals("Students")) {
                    price = 10.46;
                    totPrce = num * price;
                } else if (group.equals("Business")) {
                    price = 16;
                    totPrce = num * price;
                    if (num >= 100) {
                        totPrce = (num - 10) * price;
                    }
                } else if (group.equals("Regular")) {
                    price = 22.5;
                    totPrce = num * price;
                }
                break;
        }
        if (group.equals("Students") && num >= 30) {
            totPrce *= 0.85;
        } else if (group.equals("Regular") && ((num >= 10)&&( num<=20))) {
            totPrce *= 0.95;
        }
        System.out.printf("Total price: %.2f", totPrce);
    }
}
