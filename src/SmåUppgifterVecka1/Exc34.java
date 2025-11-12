package SmåUppgifterVecka1;

public class Exc34
{
    static void main(String[] args)
    {
        /*int i = 0;
        int summa = 0;
        while (summa<=49)
        {
            int i2 = i + 1;
            summa = i2 + summa;
            System.out.println(summa);
        }*/

        int summa = 0;
        for (int i = 0; summa<50; i++)
        {
            summa = summa+i;
            System.out.println(summa);
        }


    }
}
//.Skapa ett program som skriver ut ett tal i taget med start ifrån 0. När summan av alla
//tidigare tal är mer än 50 ska programmet avsluta.