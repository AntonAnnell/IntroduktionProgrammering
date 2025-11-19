package övningStaffanVideoVecka6Prog;

import java.util.Scanner;

public class SwitchÖvning {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Välj följande alternativ: \n" +
                "a - acetylsalicylsyra \n" +
                "b - barnavårdscentralen \n" +
                "c - citronsyracykeln \n" +
                "d - djungeltelegrafen");

        String bokstav = input.nextLine().toLowerCase();

        switch (bokstav){

            case "a":
                System.out.println("acetylsalicylsyra");
                break;

            case "b":
                System.out.println("barnavårdscentralen");
                break;

            case "c":
                System.out.println("citronsyracykeln");
                break;
            case "d":
                System.out.println("djungeltelegrafen");
                break;
            default:
                System.out.println("Skriv in en bokstav tack!");
        }
    }
}
