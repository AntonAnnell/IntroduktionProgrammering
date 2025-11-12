package SmåUppgifterVecka1;

public class Exc36
{
    static void main(String[] args)
    {
        int sparkonto = 0;
        for (int i = 0; i<=10; i++)
        {
            sparkonto += 1000*1.03;
            System.out.println(sparkonto);
        }

    }
}
//Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av
//de följande 10 åren om man sätter in 1000 kr. Räntan ska sparas och är densamma för
//alla åren.