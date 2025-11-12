package ÖvningStaffanVideoV3;

import java.util.Scanner;

public class exc1 {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv in en text:");
        String myString = input.nextLine();


        for (int i = 0; i < myString.length(); i++)
        {
            if (myString.equals("ägg"))
            {
                System.out.println("ägg är knasigt");
            }
            else
            {
                System.out.println(myString.charAt(i));
            }
        }
    }
}
