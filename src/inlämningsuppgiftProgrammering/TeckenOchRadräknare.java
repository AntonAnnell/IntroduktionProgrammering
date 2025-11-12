package inlämningsuppgiftProgrammering;

import java.util.ArrayList;

public class TeckenOchRadräknare
{
    private int antalRader;
    private int antalTecken;
    private ArrayList<String> ordLista = new ArrayList<>();

    public TeckenOchRadräknare() {

    }


    public void läggTillOrdOchRad(String ordOchRad)
        {
            antalRader++;
            antalTecken = antalTecken + ordOchRad.replace(" ", "").length();
            ordLista.add(ordOchRad);
        }

    public int getAntalRader() {
        return antalRader;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    @Override
    public String toString() {
        return String.join(" ", ordLista);
    }

    public String getLängstaOrd()
    {

        String längstaOrd = "";
        for(String ord : ordLista)
        {
            String[] Ord = ord.split("\\s+");
            for (String o : Ord)
            {
                if (o.length()>längstaOrd.length())
                {
                    längstaOrd = o;
                }
            }

        }
        return längstaOrd;
    }

    public boolean ärGiltigText(String text){
        return text.matches("[a-zA-ZåäöÅÄÖ\\s]+");
    }

    public boolean stopp(String text){
        return text.equalsIgnoreCase("stopp");
    }
}
