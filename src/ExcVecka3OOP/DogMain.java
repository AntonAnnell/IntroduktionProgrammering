package ExcVecka3OOP;

public class DogMain
{
    static void main(String[] args)
    {
        Dog novaScotia = new Dog("Tess", "NovaScotia", 8);

        novaScotia.bark();
        novaScotia.updateDogAge(9);

        System.out.println("Nu är " + novaScotia.getDogName() + " " + novaScotia.getDogAge() + " år gammal" + " och " + novaScotia.getHumanAge() + " år gammal i människoår.");

    }
}
