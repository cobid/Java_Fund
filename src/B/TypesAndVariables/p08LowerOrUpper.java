package B.TypesAndVariables;

import java.util.Scanner;

public class p08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.nextLine().charAt(0);


        if(inputChar >=65 && inputChar<=90){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }


    }
}
