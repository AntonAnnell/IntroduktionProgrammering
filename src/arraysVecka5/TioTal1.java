package arraysVecka5;

public class TioTal1 {
    static void main(String[] args) {
        int[] tioTal = {32, 42, 24, 423, 4, 3, 4, 324, 34, 23};

        for (int i = 0; i < tioTal.length; i++) {
            tioTal[i] = tioTal[i] * 2;
        }

        for (int i = 0; i < tioTal.length; i++){
            System.out.println(tioTal[i]);
        }

        System.out.println("Hej");
    }
}
//.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.