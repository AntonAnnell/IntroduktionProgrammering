package ExcVecka3OOP;

public class Dog
{
    private String dogName;
    private String dogBreed;
    private int dogAge;

    public Dog(String dogName, String dogBreed, int dogAge)
    {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
    }

    public void bark()
    {
        System.out.println("Hunden heter " + dogName + " och är en " + dogBreed + " Voff!");
    }

    public void updateDogAge(int newAge)
    {
        this.dogAge = newAge;
    }

    public int getHumanAge()
    {
        return dogAge*7;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getDogAge() {
        return dogAge;
    }
}
//13. 	Skapa en klass Dog:
//Konstruktorn ska ta in namnet och rasen på hunden. Skapa en metod bark som skriver ut ”Voff!". Skapa ett Dog-objekt i main och låt det skälla.
//
//14. Utöka Dog:
//Lägg till ett attribut age för hundens ålder. Skapa en metod som gör att du kan uppdatera hundens ålder.
//Skapa en metod getHumanAge som returnerar hundens ålder omvandlad till människoår (multiplicera med 7).
//Testa metoden i main-metoden.