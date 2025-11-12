package arraysVecka5;

import java.util.Arrays;

public class TioTal9 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, -4, 324, -34, 23};

        int[] tioTalNy = new int[10];

        for (int i = tioTal.length - 1; i >= 0; i--){
            tioTalNy[tioTal.length - 1 - i] = tioTal[i];
        }
        System.out.println(Arrays.toString(tioTalNy));
    }
}
//En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
//kommer i omvänd ordning.