package ObjektorienteringÖvningChatGPT;

import java.util.ArrayList;

public class PersonListaMain
{
    static void main(String[] args) {
        ArrayList<Person> personer = new ArrayList<>();

        personer.add(new Person("Anton", 29));
        personer.add(new Person("Adam", 31));
        personer.add(new Person("Johan", 63));

        for (int i = 0; i < personer.size(); i++)
        {
            Person p = personer.get(i);
            System.out.println(p.getNamn());
        }
    }
}
