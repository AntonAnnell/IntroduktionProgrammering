package SmåUppgifterVecka1;

import java.time.LocalTime;

public class Exc29
{
    static void main(String[] args)
    {
        int avgångTim = 12;
        int avgångMin = 41;
        int körtidTim = 3;
        int körtidMin = 47;

        LocalTime avgång = LocalTime.of(avgångTim, avgångMin);
        LocalTime ankomst = avgång.plusHours(körtidTim).plusMinutes(körtidMin);

        System.out.println("Avgångstid " + avgång);
        System.out.println("Ankomsttid " + ankomst);

    }
}
//.Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
//följande: tidpunkt i timma och minut för avgången (t ex 12:41) körtid i timma och minut (t
//ex 3:47) I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt
//passeras ska det även skrivas “NÄSTA DAG“ i utmatningsrutan.