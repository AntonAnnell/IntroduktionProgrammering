package övningStaffanVideoVecka6Prog;

import java.util.Scanner;

public class Exc1RäknaUtHypotenusa {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in katet a: ");
        int katetA = input.nextInt();

        System.out.println("Skriv in katet b: ");
        int katetB = input.nextInt();

        double hypotenusa = Math.sqrt(katetA*katetA + katetB*katetB);

        System.out.println(hypotenusa);
    }
}
