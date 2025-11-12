package ExcVecka2;

import java.util.Scanner;

public class BankAccount
{
    private double saldo;

    public BankAccount (double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void insättning(double belopp)
    {
        if (belopp > 0)
        {
            saldo = saldo + belopp;
            System.out.println("Ditt nya saldo är " + saldo);
        }
        else
        {
            System.out.println("Beloppet måste vara större än 0kr.");
        }
    }

    public void uttag (double belopp)
    {
        if (belopp > 0 && belopp <= saldo)
        {
            saldo = saldo - belopp;
            System.out.println("Du tog ut " + belopp + "kr." + " Ditt nya saldo är " + saldo + "kr");
        }
        else if (belopp > saldo)
        {
            System.out.println("Du har inte tillräckligt med krediter.");
        }
        else
        {
            System.out.println("Beloppet måste vara större än 0.");
        }
    }
}
