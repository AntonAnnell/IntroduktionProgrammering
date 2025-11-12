package ExcVecka3OOP;

public class RectangleMain
{

    static void main(String[] args)
    {
        Rectangle myReactangle = new Rectangle(5, 5);
        double resultatArea = myReactangle.CalculateArea();
        double resultatOmkrets = myReactangle.CalculateCirc();
        System.out.println("Arean är " + resultatArea + " och omkretsen är " + resultatOmkrets);
        myReactangle.isSpuare();

    }



}
