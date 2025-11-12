package SmåUppgifterVecka1;

public class Exc44
{
    static void main(String[] args)
    {
        int n = 8;
        int produkt = 1;
        for (int i = 1; i<=n; i++)
        {
            produkt*=i;
        }
        System.out.println(produkt);

    }
}
//Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
//Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5