package SmåUppgifterVecka1;

public class Exc38
{
    static void main(String[] args)
    {
        int invånare = 26000;
        int startÅr = 2016;
        int målÅr = 2030;
        for (int år = startÅr; år<=målÅr; år+=1)
        {
            int föddaInvånare = (int) (invånare*0.007);
            int avlidnaInvånare = (int) (invånare*0.006);
            int inflyttade = 300;
            int utflyttade = 325;
            int uppskattadeInvånare = invånare+föddaInvånare-avlidnaInvånare+inflyttade-utflyttade;
            invånare = uppskattadeInvånare;
            System.out.println("Uppskattade invånare " + år + " är " + uppskattadeInvånare);
        }

    }
}
//En kommun har gjort följande prognos för befolkningsutvecklingen de närmaste åren:
//- Vid början av 2016 hade kommunen 26000 invånare.
//- Antalet födda och avlidna under ett år uppskattas var 0.7 % resp 0.6 % av befolkningen
//vid årets början.
//- Antalet inflyttade och antalet utflyttade uppskattas till 300 resp 325 varje år.
//Skapa ett program som beräknar kommunens uppskattade invånarantal i början av ett
//visst år. Vilket år det gäller är indata till algoritmen.