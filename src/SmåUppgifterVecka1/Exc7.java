package SmåUppgifterVecka1;

public class Exc7
{
    static void main(String[] args)
    {
        int volym = 60;
        double LiterPris = 15.5;
        double rabatt = LiterPris*volym*0.05;

        double pris = volym*LiterPris-rabatt;
        System.out.println(pris);
    }
}
// Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
//liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala.
//Indatan kan vara definierade i variabler.