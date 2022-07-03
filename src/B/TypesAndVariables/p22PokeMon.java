package B.TypesAndVariables;

import java.util.Scanner;

public class p22PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //N-power    M-distance    Y-exhaustion
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int countTargets = 0;
        int leftFromN = 0;
        int originN = N;

        while (N >= M) {
            countTargets++;
            leftFromN = N;
            leftFromN -= M;
            if (leftFromN == originN / 2 && Y != 0) {
                leftFromN = leftFromN / Y;
            }
            N = leftFromN;
        }
        System.out.printf("%d%n", leftFromN);
        System.out.printf("%d", countTargets);
    }
}
