package ObjektorienteringÖvningChatGPT;

public class PersonMain
{
    static void main(String[] args) {
        Person Person1 = new Person("Anton", 29);

        System.out.println("Mitt namn är " + Person1.getNamn());
        System.out.println("Jag är " + Person1.getÅlder() + " år gammal.");
        Person1.födelsedag();

        Student Anton = new Student("Anton", 29, "EC-Utbildning");

        Anton.plugga();

        System.out.println(Anton);
    }
}
