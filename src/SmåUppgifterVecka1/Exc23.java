package SmåUppgifterVecka1;

public class Exc23
{
    static void main(String[] args)
    {
        int tal = 6;
        if (tal%3 == 0)
        {
            if (tal%30 == 0)
            {
                tal = tal / 3;
                System.out.println("Talet är delbart med både 3 och 30.");
            }
            else
            {
                System.out.println("Talet är delbart med 3 men inte 30");
            }

        }


    }
}
//Skapa ett program som testar om ett sparat tal är jämnt delbart med 3 men inte med
//30. I så fall ska talet divideras med 3.