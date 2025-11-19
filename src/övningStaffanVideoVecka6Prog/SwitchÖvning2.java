package övningStaffanVideoVecka6Prog;

import java.util.Scanner;

public class SwitchÖvning2 {

    Scanner input = new Scanner(System.in);

    private String namn;

    public SwitchÖvning2(){

    }

    public void läsInTal(){

        System.out.println("Skriv in ett namn på en simpsonskaraktär. Välj mellan: Homer \n" +
                "Bart \n" +
                "Marge \n" +
                "Maggie \n" +
                "Ned \n" +
                "Dr. Nick Riviera");

        namn = input.nextLine().toLowerCase();

        switch (namn){
            case "homer":
                System.out.println("D-Oh!");
                break;
            case "marge":
                System.out.println("MMMMMMMMMMMM!");
                break;
            case "bart":
                System.out.println("AY Caramba");
                break;
            case "maggie":
                System.out.println("(Pacifier suck sound");
                break;
            case "ned":
                System.out.println("Hi-Diddily-Ho");
                break;
            case "dr. nick riviera":
                System.out.println("Hi, everybody!");
                break;
            default:
                System.out.println("Skriv ett namn på de angivna karaktärerna");

        }
    }

}
