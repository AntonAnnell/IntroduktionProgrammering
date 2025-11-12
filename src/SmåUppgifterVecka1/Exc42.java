package SmåUppgifterVecka1;

public class Exc42
{
    static void main(String[] args)
    {
        int lön = 1;
        int i = 0;
        for (i = 0; lön<100000000; i++)
        {
            lön+=lön;
        }
        System.out.println(i);


    }
}
//En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För
//första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
//fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen
//måste arbeta för att tjäna en miljon kronor.