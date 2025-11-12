package ExcVecka3OOP;

public class StudentMain
{
    static void main(String[] args)
    {
        Student student1 = new Student("Sara ", 8);

        student1.promote();
        System.out.print(student1.getStudentNamn()); student1.stadie();
    }
}
