package arraysVecka5;

public class TioTal5 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, -423, 4, 3, 4, 324, 34, 23};
        for (int i = tioTal.length - 1; i >= 0; i--){
            if (tioTal[i] < 0){
                System.out.println("Det sista tal som är negativt är " + tioTal[i]);

                break;
            }
        }
    }
}
//En array med 10 inlästa tal finns. Bestäm och skriv ut index för det sista negativa talet i
//arrayn. (Tips: Börja bakifrån i arrayn).