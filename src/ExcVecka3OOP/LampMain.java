package ExcVecka3OOP;

public class LampMain
{
    static void main(String[] args)
    {
        Lamp lamp = new Lamp(false);

        System.out.println(lamp.turnOn());
        System.out.println(lamp.turnOff());
    }
}
