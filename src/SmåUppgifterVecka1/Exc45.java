package SmåUppgifterVecka1;

public class Exc45
{
    static void main(String[] args)
    {
       for (int tabell = 1; tabell<=9; tabell++)
       {
           System.out.println("Multiplikationstabell för " + tabell + ".");

           for (int i = 1; i<=10; i++)
           {
               System.out.println(tabell + " * " + i + " = " + tabell*i);
           }
       }

    }
}
//Skapa ett program som skriver ut multiplikationstabellen för ettans till nians tabell.