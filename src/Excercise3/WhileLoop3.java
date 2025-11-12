package Excercise3;

public class WhileLoop3

{
    static void main(String[] args)
    {
        int count1 = 1;

        System.out.println(count1);

        int count2 = 1;

        while (count2 <= 89)
        {
            System.out.println(count2);
            int count3 = count1 + count2;
            count1 = count2;
            count2 = count3;



        }
    }
}
// Skriv ut alla fibonnacci-tal ifrån 1-100. Fibonnacci-tal är de två senaste talen adderat och börjar med 1,
// 1 som första två tal.
// Exempel: 1, 1, 2, 3, 5, 8, 13, 21…