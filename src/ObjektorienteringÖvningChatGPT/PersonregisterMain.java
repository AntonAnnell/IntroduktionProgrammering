package ObjektorienteringÖvningChatGPT;

public class PersonregisterMain
{
    static void main(String[] args) {

        Personregister register = new Personregister();

        register.läggTillPerson(new Person("Göran", 85));
        register.läggTillPerson(new Person("Birgitta", 79));
        register.läggTillPerson(new Person("Max", 26));
        register.läggTillPerson(new Person("Wilmer", 22));

        register.skrivUtAlla();
    }
}
