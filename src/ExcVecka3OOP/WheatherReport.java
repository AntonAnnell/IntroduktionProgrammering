package ExcVecka3OOP;

public class WheatherReport
{
    private int temp;
    private String beskrivning;

    public WheatherReport(int temp, String beskrivning)
    {
        this.temp = temp;
        this.beskrivning = beskrivning;
    }

    public String getDescription()
    {
        return "Det är " + temp + " grader varmt och " + beskrivning;
    }
}
//Skapa en klass WeatherReport:
//Konstruktorn ska ta in temperatur och beskrivning (t.ex. "soligt", "regnigt").
//Skapa en metod getDescription som returnerar en beskrivning av vädret.
//Skapa ett WeatherReport-objekt i main och skriv ut väderbeskrivningen.