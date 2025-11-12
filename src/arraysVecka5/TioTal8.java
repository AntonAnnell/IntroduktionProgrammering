package arraysVecka5;

public class TioTal8 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, -4, 324, -34, 23};
        int positivSumma = 0;
        int negativSumma = 0;
        for (int i = 0; i < tioTal.length; i++) {
            if (tioTal[i] < 0) {
                negativSumma = negativSumma + tioTal[i];
            } else if (tioTal[i] > 0) {
                positivSumma = positivSumma + tioTal[i];
            }
        }
        System.out.println("Summan av de negativa talen är " + negativSumma);
        System.out.println("Summan av de positiva talen är " + positivSumma);
    }
}
//En array med 10 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal
//och summan av alla negativa tal i arrayn.