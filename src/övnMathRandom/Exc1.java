package övnMathRandom;

import java.util.Scanner;

public class Exc1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int n = (int) ((int) range * Math.random() - min);

        System.out.println("Gissa vilket tal jag genererade mellan 1-100?");


        boolean myBoolean = true;
        while (myBoolean) {

            int gissning = input.nextInt();

            if (gissning == n) {
                System.out.println("Rätt!");
                myBoolean = false;

            } else if (gissning < n && gissning > 0) {
                System.out.println("Högre. \n" +
                        "Gissa igen.");

            } else if (gissning > n && gissning < 101) {
                System.out.println("Lägre. \n" +
                        "Gissa igen.");

            } else {
                System.out.println("Skriv en siffra mellan 1-100");
            }

        }


    }
}

