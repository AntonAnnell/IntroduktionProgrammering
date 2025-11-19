package games;

import java.util.Scanner;

public class FörstTill21 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int summa = 0;

        boolean myBoolean = true;
        while (myBoolean){
            System.out.println("1 eller 2?");
            summa = input.nextInt();

        }
        for (int i = 0; i < 21; i = i + summa){
            System.out.println("1 eller 2?");
            i = input.nextInt();

        }
    }
}
//Man börjar på 0
//Man får lägga till 1 eller 2
//Först till 21 vinner