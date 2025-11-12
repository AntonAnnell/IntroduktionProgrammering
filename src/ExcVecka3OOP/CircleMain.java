package ExcVecka3OOP;

public class CircleMain
{
    static void main(String[] args)
    {
        Circle myCircle = new Circle(5);
        System.out.println("Cirkelns area är " + myCircle.calculateArea() + " och cirkelns omkrets är " + myCircle.calculateCirc());
        myCircle.isBiggerThan();

    }
}
