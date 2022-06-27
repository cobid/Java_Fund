package D.Methods;

import java.util.Scanner;

public class p20GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String value1 = scanner.nextLine();
        String value2 = scanner.nextLine();


        switch (type) {
            case "int":
                System.out.println(maxNum(value1, value2));
                break;
            case "char":
                System.out.println(bigChar(value1, value2));
                break;
            case "string":
                System.out.print(stringLength(value1, value2));
                break;
        }
    }

    private static String maxNum(String num1, String num2) {
        if (Integer.parseInt(num1) > Integer.parseInt(num2)) {
            return num1;
        } else {
            return num2;
        }
    }

    private static String bigChar(String firstChar, String secondChar) {
        if (firstChar.charAt(0) > secondChar.charAt(0)) {
            return firstChar;
        } else {
            return secondChar;
        }
    }
    private static String stringLength(String stringValue1, String stringValue2) {
        if (stringValue1.compareTo(stringValue2) >= 0) {
            return stringValue1;
        }
        return stringValue2;
    }
}
