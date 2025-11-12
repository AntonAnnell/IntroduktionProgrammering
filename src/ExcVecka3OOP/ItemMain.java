package ExcVecka3OOP;

public class ItemMain
{
    static void main(String[] args)
    {
        Item item1 = new Item("ZYN", 33);

        System.out.println(item1.getNamn() + " kostar " + item1.getPris() + "kr.");
        System.out.println(item1.applyDiscount(0.8));
    }
}
