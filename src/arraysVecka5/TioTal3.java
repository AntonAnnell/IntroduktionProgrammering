package arraysVecka5;

import java.util.Arrays;

public class TioTal3 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, 4, 324, 34, 23};
        int antalPositiva = 0;
        for (int i = 0; i < tioTal.length; i++) {
            if (tioTal[i] > 0) {
                antalPositiva++;
            }
        }
        System.out.println(antalPositiva + " antal tal är positiva");

    }
}
//.En array med 10 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.