package ExcVecka3OOP;

public class Car
{
    private String brand;
    private String model;
    private int year;


    public Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void getInfo()
    {
        System.out.println("Bilen är en " + brand + " " + model + " och den är av året " + year);
    }
}
//Skapa en klass Car som har attributen brand, model och year.
//Skapa en metod som skriver ut all information om bilen.
//Skapa minst tre olika Car-objekt i en annan klass (CarShowroomMain) och anropa metoden för att visa informationen.
//Utöka sedan Car med en metod som jämför bilarnas årsmodell och skriver ut vilken som är nyast.