package SmåUppgifterVecka1;

public class Exc2
{
    static void main(String[] args)
    {
        int salary = 8000;
        double sales = 0.09;
        sales = sales * 1000; //Sålde för 1000kr denna månad

        System.out.println(sales + salary);
    }
}
// En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9%
//av försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
//Försäljningssumman ska vara definierad i en variabel.