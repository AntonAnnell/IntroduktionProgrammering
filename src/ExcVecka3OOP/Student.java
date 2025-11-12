package ExcVecka3OOP;

public class Student
{
    private String studentNamn;
    private int årskurs;

    public Student(String studentNamn, int årskurs)
    {
        this.studentNamn = studentNamn;
        this.årskurs = årskurs;
    }

    public int promote()
    {
        årskurs++;
        return årskurs;
    }

    public String getStudentNamn() {
        return studentNamn;
    }

    public void stadie()
    {
        if (årskurs >=1 && årskurs <=3)
        {
            System.out.println("går i lågstadiet");
        }
        else if (årskurs >= 4 && årskurs <= 6)
        {
            System.out.println("går i mellanstadiet");
        }
        else if (årskurs >= 7 && årskurs <= 9)
        {
            System.out.println("går i högstadiet");
        }
        else if (årskurs <=0)
        {
            System.out.println("är för ung för att ha börjat skolan");
        }
        else
        {
            System.out.println("har börjat på gymnasiet");
        }


    }
}
//15. 	Skapa en klass Student:
//Konstruktorn ska ta in namn och årskurs.
//Skapa en metod promote som ökar årskursen med 1.
// Skapa en metod som skriver ut vilket stadie man går på (Lågstadiet,
// mellanstadiet osv.) Skapa ett Student-objekt och låt det gå upp en årskurs i main-metoden.
// Skriv ut årskurs och stadie ifrån mainmetoden.