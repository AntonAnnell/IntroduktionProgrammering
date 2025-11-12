package SmåUppgifterVecka1;

public class Exc16
{
    static void main()
    {
        int inköptaPennor = 100;
        int prisPenna = 10;
        int prisSumma = inköptaPennor*prisPenna;
        if (prisSumma>=1000)
        {
            double rabatteradPrisSumma = prisSumma - prisSumma*0.1;
            System.out.println("Du får 10% rabatt. Priset blir " + rabatteradPrisSumma);
        }
    }
}
//En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
//handlar för minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett
//visst slag. Skapa ett program som beräknar vad en kund ska betala. Indata till algoritmen
//ska vara antalet köpta enheter och priset per enhet.