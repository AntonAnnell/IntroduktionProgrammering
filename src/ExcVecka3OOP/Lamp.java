package ExcVecka3OOP;

public class Lamp
{
    private boolean isOn;

    public Lamp(boolean isOn)
    {
        this.isOn = isOn;
    }

    public String turnOn()
    {
        isOn = true;
        return "Lampan är nu på";
    }

    public String turnOff()
    {
        isOn = false;
        return "Lampan är nu av";
    }
}
//Skapa en klass Lamp:
//Konstruktorn ska ta in ett boolean-attribut isOn.
//Skapa metoder turnOn och turnOff för att slå på och av lampan.
//Skapa ett Lamp-objekt i main och växla mellan på och av.