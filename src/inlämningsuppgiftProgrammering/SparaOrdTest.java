package inlämningsuppgiftProgrammering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SparaOrdTest {

    @Test
    void testMedSiffror(){
        TeckenOchRadräknare rad1 = new TeckenOchRadräknare();

        assertTrue(rad1.ärGiltigText("hej123"));

    }

    @Test
    void testMedSpecialtecken(){
        TeckenOchRadräknare rad2 = new TeckenOchRadräknare();

        assertTrue(rad2.ärGiltigText("Hej."));
        assertTrue(rad2.ärGiltigText("Hej!"));
    }

    @Test
    void testMedRadbrytning(){
        TeckenOchRadräknare rad3 = new TeckenOchRadräknare();

        assertTrue(rad3.ärGiltigText("\n" +
                ""));
    }

    @Test
    void testMedBlanktSvar(){
        TeckenOchRadräknare rad4 = new TeckenOchRadräknare();

        assertTrue(rad4.ärGiltigText(""));
    }

    @Test
    void testaStoppFunktion(){
        TeckenOchRadräknare rad5 = new TeckenOchRadräknare();

        assertTrue(rad5.stopp("stopp"));
        assertTrue(rad5.stopp("Stopp"));
        assertTrue(rad5.stopp("Jag heter Anton stopp"));
    }
}
