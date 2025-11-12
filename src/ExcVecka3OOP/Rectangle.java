package ExcVecka3OOP;

public class Rectangle
{
    private double width;
    private double length;

    public Rectangle(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    public double CalculateArea()
    {
        return width*length;

    }

    public double CalculateCirc()
    {
        return width*2 + length*2;
    }

    public void isSpuare()
    {
        if (width == length)
        {
            System.out.println("Det är en kvadrat.");
        }
        else
        {
            System.out.println("Det är inte en kvadrat.");
        }
    }
}
