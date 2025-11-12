package arraysVecka5;

public class TioTal6 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, 4, 324, 34, 23};
        int summa = 0;
        for (int i = 0; i < tioTal.length; i++){
            System.out.println(summa + " + " + tioTal[i]);
            summa = summa + tioTal[i];

        }
        double medelvärde = summa/(double) tioTal.length;
        System.out.println("Summan av alla tal blir " + summa);
        System.out.println("Medelvärdet av alla tal blir " + medelvärde);
    }
}
//En array med 10 inlästa tal finns. Beräkna och skriv ut summan och medelvärdet av de
//10 talen.