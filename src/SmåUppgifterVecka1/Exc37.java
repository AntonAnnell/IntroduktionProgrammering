package SmåUppgifterVecka1;

public class Exc37
{
    static void main(String[] args)
    {
        int summa = 1;
        for (int i = 1; summa<=10000; i++)
        {
            summa *= i;
            System.out.println(summa);

            if (summa>10000)
            {
                System.out.println("Överstiger 10000");
                break;
            }
        }

    }
}
//.Skapa ett program som skriver ut talen 1, 2, 3 osv. ett i taget. Varje gång ett tal skrivs
//ut skall programmet kontrollera om alla tidigare tal multiplicerat med varandra överstiger
//10 000. I så fall skall programet avslutas.