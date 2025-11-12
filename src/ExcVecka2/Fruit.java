package ExcVecka2;

public class Fruit {

    private String color; // Attribut, fruktens färg och namn
    private String name;

    public Fruit (String fruitColor, String fruitName) // Konstruktor, för att skapa en ny frukt
    {
        color = fruitColor;
        name = fruitName;
    }

    public void printInfo() // Metod, skriver ut färgen och namnet på frukten
    {
        System.out.println(color + " " + name);
    }

}
//Skapa en class Fruit som beskriver olika frukter
//
//Attributet som definieras i konstruktorn heter color och är fruktens färg
//
//Skapa tre olika Fruit ifrån main-metod i en annan klass FruitSalad
//
//Utöka Fruit så att det kan skriva ut färgen på frukten
//
//Anropa denna metod för de tre frukterna i FruitSalad

