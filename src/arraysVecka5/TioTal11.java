package arraysVecka5;

import java.util.Arrays;
import java.util.Scanner;

public class TioTal11 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tvåBråkTal = new int[2];
        for (int i = 0; i < tvåBråkTal.length; i++){
            System.out.println("Skriv in en täljare; ");
            tvåBråkTal[i] = input.nextInt();
            System.out.println("Skriv in en nämnare; ");
            tvåBråkTal[i] = tvåBråkTal[i] / input.nextInt();

        }
        System.out.println(Arrays.toString(tvåBråkTal));
    }
}
//Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array
//med två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande
//skrivas ut om så är fallet.