package ObjektorienteringÖvningChatGPT;

public class Student extends Person
{
    public String skola;

    public Student(String namn, int ålder, String skola)
    {
        super(namn, ålder);
        this.skola = skola;
    }

    public void plugga()
    {
        System.out.println(getNamn() + " pluggar på " + skola);
    }

    @Override
    public String toString() {
        return "Namn, " + getNamn() + "ålder, " + getÅlder() + "skola: " + skola;
    }
}
