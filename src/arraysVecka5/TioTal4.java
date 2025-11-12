package arraysVecka5;

public class TioTal4 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, 4, 324, 34, 23};
        int förstaTalet = tioTal[0];
        int antalStörreTalÄnDetFörstaTalet = 0;
        for (int i = 1; i < tioTal.length; i++) {
            if (tioTal[i] > förstaTalet) {
                antalStörreTalÄnDetFörstaTalet++;
            }
        }
        System.out.println(antalStörreTalÄnDetFörstaTalet + " tal är större än det första talet.");
    }
}
//En array med 10 inlästa tal finns. Ta reda på och skriv ut hur många tal som är större än
//det första talet.