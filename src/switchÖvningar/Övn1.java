package switchÖvningar;

import java.util.Scanner;

public class Övn1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv en siffra 1-7 och få reda på vilken dag det är: ");

        int day = input.nextInt();
        input.nextLine();

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Ogiltig dag");
        }

        System.out.println("Skriv in en månad så anger jag vilken årstid det är.");

        String månad = input.nextLine();

        switch (månad) {
            case "Januari":
                System.out.println("Vinter");
                break;
            case "Februari":
                System.out.println("Vinter");
                break;
            case "Mars":
                System.out.println("Vinter");
                break;
            case "April":
                System.out.println("Vår");
                break;
            case "Maj":
                System.out.println("Vår");
                break;
            case "Juni":
                System.out.println("Sommar");
                break;
            case "Juli":
                System.out.println("Sommar");
                break;
            case "Augusti":
                System.out.println("Sommar");
                break;
            case "September":
                System.out.println("Höst");
                break;
            case "Oktober":
                System.out.println("Höst");
                break;
            case "November":
                System.out.println("Höst");
                break;
            case "December":
                System.out.println("Vinter");
                break;
            default:
                System.out.println("Ogiltig inmatning");
        }
    }
}
