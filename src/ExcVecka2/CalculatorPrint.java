package ExcVecka2;

import java.util.Scanner;

public class CalculatorPrint
{
    static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Skapar scanner

        System.out.println("Ange första talet: "); // Läser in första talet
        int tal1 = input.nextInt();

        System.out.println("Ange andra talet: "); // Läser in andra talet
        int tal2 = input.nextInt();

        Calculator addition = new Calculator(tal1, tal2); // Skapar Calculator objekt med användarens tal

        addition.printInfo();
    }
}
