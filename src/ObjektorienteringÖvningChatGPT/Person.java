package ObjektorienteringÖvningChatGPT;

public class Person
{
    private String namn;
    private int ålder;

    public Person (String namn, int ålder)
    {
        this.namn = namn;
        this.ålder = ålder;
    }

    public String getNamn() {
        return namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public void födelsedag()
    {
        ålder++;
        System.out.println("Grattis " + namn + " du är nu " + ålder + " år gammal.");

    }

    @Override
    public String toString() {
        return "Namn, " + namn + "ålder, " + ålder;
    }
}


