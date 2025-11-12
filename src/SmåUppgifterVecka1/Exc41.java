package SmåUppgifterVecka1;

public class Exc41
{
    static void main(String[] args)
    {
        int summa = 0;
        int i = 0;

        for (i = 0; summa<100000; i++)
        {
            summa+=7;
        }
        System.out.println(i);

    }
}
//. Skapa ett program där det undersöks hur många termer som behövs för att summan
//ska bli större än 100 000. Termen ska läsas in.
//Ex: Om indata är 7 ska beräkningen vara 7 + 7 + 7 + …7 = 100 000.
//Utdata = 14286