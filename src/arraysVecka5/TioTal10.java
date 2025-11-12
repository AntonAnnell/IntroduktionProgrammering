package arraysVecka5;

import java.util.Arrays;
import java.util.Scanner;

public class TioTal10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] tioHeltal = new int[10];

        for (int i = 0; i < tioHeltal.length; i++){
            System.out.println("Skriv in ett heltal; ");
            tioHeltal[i] = input.nextInt();
        }
        for (int i = tioHeltal.length - 1; i >= 0; i--){
            System.out.println(tioHeltal[i]);
        }
    }
}
//Skapa ett program som läser in 10 heltal till en array och sedan skriver ut talen
//baklänges. Endast en array ska användas.