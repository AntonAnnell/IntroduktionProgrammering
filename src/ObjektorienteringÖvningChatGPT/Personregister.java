package ObjektorienteringÖvningChatGPT;

import java.util.ArrayList;

public class Personregister
{
    private ArrayList<Person> personer = new ArrayList<>();

    public void läggTillPerson(Person p)
    {
        personer.add(p);

    }

    public void skrivUtAlla()
    {
        for (Person p : personer)
        {
            System.out.println(p.getNamn() + " " + p.getÅlder());
        }

    }

    public Person hittaPerson(String namn)
    {
        for (Person p : personer)
        {
            if (p.getNamn().equalsIgnoreCase(namn))
            {
                return p;

            }
        }

        return null;


    }

}
