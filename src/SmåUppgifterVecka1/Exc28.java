package SmåUppgifterVecka1;

public class Exc28
{
    static void main(String[] args)
    {
        int temp = 30;
        if (temp >=18 && temp <=25)
        {
            System.out.println("Lagom temp.");
        }
        else if (temp<=18)
        {
            System.out.println("För kallt");
        }
        else
        {
            System.out.println("För varmt");
        }

    }
}
//Skapa ett program som sparar en temperatur. Om temperaturen är mellan 18 och 25
//grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25 grader ska
//“För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut.