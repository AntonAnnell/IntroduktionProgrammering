package arraysVecka5;

public class TioTal2 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, 423, 4, 3, 4, 324, 34, 23};

        for (int i = 0; i < tioTal.length; i++) {
            if (i % 2 == 0) {
                tioTal[i] = tioTal[i] +2;
            }
        }

        for (int i = 0; i < tioTal.length; i++){
            System.out.println(tioTal[i]);
        }

    }
}
//En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
//arrayn.