package ExcVecka2;

import java.util.Scanner;

public class Calculator
{
    private int tal1;
    private int tal2;

    public Calculator (int tal1, int tal2)
    {
        this.tal1 = tal1;
        this.tal2 = tal2;

    }

    public void printInfo()
    {
        System.out.println(this.tal1 + this.tal2);
    }
}
//Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut
//
//7.	Skapa en metod som skriver ut addition för 	dessa två tal. Skapa ett objekt och anropa 	denna metod ifrån en annan klass som har en 	main-metodPr
//
//8.	Uppdatera din main-metod så att den läser in 	de två talen med Scanner
//
//9.	Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger