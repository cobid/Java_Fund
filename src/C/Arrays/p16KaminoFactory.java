package C.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class p16KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLong = Integer.parseInt(scanner.nextLine());
        int countLine = 0;
        String input = scanner.nextLine();
        String[] bestLine = new String[numLong];
        int bestCountLineNumbers = 0;
        int bestIndex = 0;
        int bestSum = 0;
        int bestCountLine = 0;
        while (!input.equals("Clone them!")) {
            countLine++;
            int currentIndex = 0;
            int countLineNumbers = 0;
            int sumFromOnes = 0;
            String[] dna = input.split("!+");
            for (int i = 0; i < dna.length; i++) {
                if (dna[i].equals("1")) {
                    int number = Integer.parseInt(dna[i]);
                    countLineNumbers++;
                    sumFromOnes += number;
                    currentIndex = i + 1 - countLineNumbers;
                } else if (dna[i].equals("0")) {
                    countLineNumbers = 0;
                }
                if (countLineNumbers > bestCountLineNumbers ||
                        (countLineNumbers == bestCountLineNumbers && currentIndex < bestIndex)||
                        (countLineNumbers == bestCountLineNumbers && currentIndex == bestIndex )) {
                    if(sumFromOnes >= bestSum) {
                        bestSum = sumFromOnes;

                        bestCountLineNumbers = countLineNumbers;
                        bestIndex = currentIndex;
                        bestCountLine = countLine;

                        for (int j = 0; j < bestLine.length; j++) {
                            bestLine[j] = dna[j];
                        }
            }

                }

                for (int j = 0; j < bestLine.length; j++) {
                    bestLine[j] = dna[j];
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCountLine, bestSum);

        for (int i = 0; i < bestLine.length; i++) {
            System.out.print(bestLine[i] + " ");
        }
    }
}

