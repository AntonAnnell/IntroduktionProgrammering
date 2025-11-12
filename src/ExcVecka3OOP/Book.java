package ExcVecka3OOP;

public class Book
{
    private String titel;
    private String författare;
    private int pages;

    public Book(String titel, String författare, int pages)
    {
        this.titel = titel;
        this.författare = författare;
        this.pages = pages;
    }

    public int läs(int lästaSidor)
    {
        pages = pages-lästaSidor;

            return pages;

    }
}
//Skapa en klass Book med attributen title, author och pages.
//Lägg till en metod read(int pagesRead) som ökar antalet sidor som användaren har läst.
//Om användaren försöker läsa fler sidor än boken har, skriv ut ett felmeddelande.
//Testa klassen i LibraryApp genom att skapa minst två olika böcker och simulera att du läser olika mängder sidor i varje bok.