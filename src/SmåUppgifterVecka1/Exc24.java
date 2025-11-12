package SmåUppgifterVecka1;

public class Exc24
{
    static void main(String[] args)
    {
        int kroppstemperatur =36;
        if (kroppstemperatur<35)
        {
            System.out.println("Din kroppstemperatur är för låg");
        }
        else if (kroppstemperatur>42)
        {
            System.out.println("Din kroppstemperatur är hög");
        }
        else
        {
            System.out.println("Din kroppstemperatur är normal");
        }
    }
}
//.Skapa ett program som sparar kroppstemperaturen och skriver ut ett lämpligt
//meddelande om temperaturen är mindre än 35 grader eller större än 42 grader.