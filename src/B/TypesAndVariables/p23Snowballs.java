package B.TypesAndVariables;

import java.util.Scanner;

public class p23Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        double bestSnowballValue = 0;
        double bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;


        for (int i = 1; i <= num; i++) {
            double snowballSnow = Double.parseDouble(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double currentBestSnowball = Math.pow(( snowballSnow / snowballTime), snowballQuality);

            if (currentBestSnowball > bestSnowballValue) {
                bestSnowballValue = currentBestSnowball;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;

            }
        }
        //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality}
        System.out.printf("%.0f : %d = %.0f (%d)", bestSnowballSnow, bestSnowballTime, bestSnowballValue, bestSnowballQuality);

    }

}

