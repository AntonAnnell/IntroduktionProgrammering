package SmåUppgifterVecka1;

public class Exc43
{
    static void main(String[] args)
    {
        int summa = 1;
        for (int i = 1; i<=15; i+=2)
        {
            summa = summa*i;
        }
        System.out.println(summa);

    }
}
//Beräkna och skriv ut produkten av de ojämna heltalen från 1 till 15. (D v s
//1*3*5*…*15)