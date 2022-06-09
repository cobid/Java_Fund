package A.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class p27PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0.0;
        int studentNotCount = 0;

        totalPrice = (lightSabers * Math.ceil(students * 1.10) + (students * robes));
        if (students >= 6) {
            studentNotCount = students / 6;
            totalPrice = totalPrice + ((students - studentNotCount) * belts);
        }else {
            totalPrice = totalPrice + (students * belts);
        }
        if (amount <= totalPrice) {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPrice - amount));
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
    }
}
