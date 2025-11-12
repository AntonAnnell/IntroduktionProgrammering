package SmåUppgifterVecka1;

public class Exc27
{
    static void main(String[] args)
    {
        int tal1 = 47;
        int tal2 = 89;
        int tal3 = 100;
        if (tal1>tal2 && tal1>tal3)
        {
            System.out.println("Tal 1 är störst");
        }

        else if (tal2>tal1 && tal2>tal3)
        {
            System.out.println("Tal 2 är störst");

        }
        else
        {
            System.out.println("Tal 3 är störst");
        }

    }
}
//Skapa ett program som sparar tre tal och avgör vilket tal som är minst. Resultatet ska
//skrivas ut.