package arraysVecka5;

import java.util.Arrays;
import java.util.Scanner;

public class TioTal12 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tvåBråkTal = new int[2];
        for (int i = 0; i < tvåBråkTal.length; i++) {
            if (i == 0) {
                System.out.println("Skriv in en täljare; ");
                tvåBråkTal[i] = input.nextInt();
                System.out.println("Skriv in en nämnare; ");
                tvåBråkTal[i] = tvåBråkTal[i] / input.nextInt();
            } else if (i == 1) {
                System.out.println("Skriv in en täljare; ");
                tvåBråkTal[i] = input.nextInt();
                System.out.println("Skriv in en nämnare; ");
                tvåBråkTal[i] = tvåBråkTal[i] / Math.abs(input.nextInt());

            }

        }
        System.out.println(Arrays.toString(tvåBråkTal));
    }
}
//Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Det är
//inte vanligt att man låter nämnaren vara negativ. Om så är fallet ska bråket ändras så att
//nämnaren blir positiv.