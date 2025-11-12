package SmåUppgifterVecka1;

public class Exc39
{
    static void main(String[] args)
    {
        double pris = 1500;
        double rabatt = 0.2;
        int i = 0;

        for (i = 0; pris>100; i++)
        {
            pris = pris-pris*rabatt;


        }
        System.out.println(i);


    }
}
//. Skapa ett program som har sparat ett pris på 1500 kr. Till detta pris kan man få rabatt
//på 20 %. Dessa rabatter går att kombinera. Skriv ut hur många rabatter man behöver
//använda för att priset ska bli mindre än 100 kr.