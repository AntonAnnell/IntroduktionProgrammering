package ExcVecka3OOP;

public class Item
{
    private String namn;
    private double pris;

    public Item(String namn, double pris)
    {
        this.namn = namn;
        this.pris = pris;
    }

    public String applyDiscount(double discount)
    {
        pris = pris*discount;
        return "Med rabatt kostar det " + pris;
    }

    public double getPris() {
        return pris;
    }

    public String getNamn() {
        return namn;
    }
}
//Skapa en klass Item:
//Konstruktorn ska ta in ett namn och ett pris.
//Skapa en metod applyDiscount som tar in en procent och sänker priset med den procentsatsen.
//Skapa ett Item-objekt i main, applicera en rabatt och visa det nya priset.