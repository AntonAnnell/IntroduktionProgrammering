package ExcVecka3OOP;

public class CarMain
{
    static void main(String[] args)
    {
        Car Audi = new Car("Audi", "A4", 2012);
        Car BMW = new Car("BMW", "Series 1", 2020);
        Car Volvo = new Car("Volvo", "V70", 2015);

        Audi.getInfo();
        BMW.getInfo();
        Volvo.getInfo();



    }
}
