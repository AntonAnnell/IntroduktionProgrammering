package ExcVecka3OOP;

import java.util.Scanner;

public class BookMain
{
    static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book("Harry potter", "JK Rowling", 450);
        Book book2 = new Book("Sagan om ringen", "JJR Tolkien", 500);


        System.out.println("Skriv in hur många sidor du har läst: ");
        System.out.println("Du har " +  book1.läs(90) + " sidor kvar.");


    }
}
