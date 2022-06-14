package FINALEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])([@][#]+)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String productGroup = "";
                String foundMatch = matcher.group("barcode");
                Pattern patternNumber = Pattern.compile("[0-9]+");
                Matcher matcherNumber = patternNumber.matcher(foundMatch);
                while (matcherNumber.find()) {
                        productGroup = productGroup.concat(matcherNumber.group());
                    }
                if(productGroup.equals("")){
                    productGroup = "00";
                }
                System.out.printf("Product group: %s%n", productGroup);
            } else {
                System.out.printf("Invalid barcode%n");
            }
        }
    }
}
