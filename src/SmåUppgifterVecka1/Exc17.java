package SmåUppgifterVecka1;

public class Exc17
{
    static void main()
    {
        double tal1 = 45;
        double tal2 = 19;
        double tal3 = tal1/tal2;
        if (tal3 == 0)
        {
            System.out.println("Error.");
        }
        else
        {
            System.out.println(tal3);
        }
    }
}
//Skapa ett program som sparar två tal och dividerar det första talet med det andra
//talet. Om det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten
//skrivas ut.