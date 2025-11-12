package ExcVecka2;

import ExcVecka2.BankAccount;

import java.util.Scanner;

public class BankAccountMain
{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount myBankaccount = new BankAccount(500);


        boolean myBoolean = true;
        while (myBoolean)
        {
            System.out.println("Ditt saldo är: " + myBankaccount.getSaldo());
            System.out.println("Vill du sätta in pengar, skriv; sätt in.");
            System.out.println("Vill du ta ut pengar, skriv: ta ut.");
            System.out.println("Vill du avsluta, skriv: avsluta.");
            String svar = input.nextLine().toLowerCase();

            if (svar.equals("sätt in"))
            {
                System.out.println("Skriv in hur mycket du vill sätta in: ");
                double belopp = input.nextDouble();
                input.nextLine();

                myBankaccount.insättning(belopp);
            }
            else if (svar.equals("ta ut"))
            {
                System.out.println("Skriv in hur mycket du vill ta ut:");
                double belopp = input.nextDouble();
                input.nextLine();

                myBankaccount.uttag(belopp);

            }
            else if (svar.equals("avsluta"))
            {
                System.out.println("Ok. Hej då. Programmet avslutas...");
                myBoolean = false;
            }
            else
            {
                System.out.println("Ogiltigt svar. Skriv in ja eller nej.");
            }

        }



    }

}
//10. 	Skapa ett program BankAccount som kan hålla 	koll på hur stort saldo man har (pengar på sitt 	konto)
//
//11. 	Utöka programmet så att man kan skriva ut 	saldot
//
//12. 	Utöka programmet så att man kan bestämma 	ett nytt värde för saldo
//
//13. 	Utöka programmet så att man kan lägga till 	och ta bort en viss summa ifrån saldot

//Utöka programmet så att man aldrig kan få ett 	saldo som är mindre än 0 kronor
//
//Överkursuppgifter:
//
//15. 	Utöka programmet så att man i programmet 	som anropar BankAccount får reda på vad 	saldot är (så att man kan skriva ut det ifrån 	main-programmet istället för direkt i 	BankAccount). Metoden borde se ut ungefär 	såhär:
//
//public int getAmount() {
//	return amount;