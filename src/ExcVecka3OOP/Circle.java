package ExcVecka3OOP;

public class Circle
{
    private double radie;

    public Circle(double radie)
    {
        this.radie = radie;
    }

    public double calculateArea()
    {
        return 3.14*radie*radie;
    }

    public double calculateCirc()
    {
        return radie*2*3.14;
    }

    public void isBiggerThan()
    {
        if (radie > 7)
        {
            System.out.println("Cirkeln är större än den aktuella cirkeln");
        }
        else if (radie < 7)
        {
            System.out.println("Cirkeln är mindre än den aktuella cirkeln");
        }
        else
        {
            System.out.println("Cirklarna är lika stora");
        }
    }

}
//7. 	Skapa en klass Circle. Konstruktorn ska ta in radien som ett attribut.
//
//8. 	Skapa en metod calculateArea som returnerar cirkelns area.
//
//9. 	Skapa en metod calculateCircumference som returnerar cirkelns omkrets.
//
//10. 	Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.
//11.
//      Utöka Circle. Lägg till en metod isBiggerThan som tar in en annan Circle och returnerar om den aktuella cirkeln
//      har större area än den andra cirkeln.
//
// 12. 	Använd denna metod i main-metoden för att jämföra två cirklar.
