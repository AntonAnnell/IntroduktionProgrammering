package inlämningsuppgiftProgrammering;

import java.util.Scanner;

public class SparaOrd {
    private TeckenOchRadräknare räknare = new TeckenOchRadräknare();
    Scanner input = new Scanner(System.in);

    public SparaOrd(String s) {
    }

    public void läsInOrd(String svar) {
        System.out.println("Skriv en text rad för rad. Skriv stopp om du vill se hur många tecken och rader du skrivit");

        boolean myBoolean = true;
        while (myBoolean) {
            svar = input.nextLine();

            if (räknare.stopp(svar)) {
                System.out.println("Du skrev " + räknare.getAntalRader() + " antal rader och " + räknare.getAntalTecken() + " antal tecken.");
                System.out.println("Du skrev följande: " + räknare.toString());
                System.out.println("Det längsta ordet du skrev var: " + räknare.getLängstaOrd());
                myBoolean = false;
            } else if (räknare.ärGiltigText(svar)) {
                räknare.läggTillOrdOchRad(svar);

            } else {
                System.out.println("Ogiltig inmatning. Skriv en text med endast bokstäver.");
            }

        }

    }




}
//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med
// ordet stopp.
//Programmet skall bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som räknar raderna och har koll på antalet tecken
//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill