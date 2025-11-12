package arraysVecka5;

public class Personnummer {
    static void main(String[] args) {
        char[] personNr = {'1', '9', '9', '9', '0', '1', '0', '1', '-', '0', '0', '0', '1'};

        if(personNr[8] != '-'){
            System.out.println("Bindesstreck saknas.");
        }

        if (personNr[10] % 2 == 0){

        }
    }
}
//I en array finns ett personnummer. Skapa ett program som kontrollerar att
//födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett
//felmeddelande om så ej är fallet.
//Om den näst sista siffran är jämn i personnumret är det en kvinna, om den är ojämn är
//det en man. Avgör om personen i föregående uppgift är man eller kvinna.