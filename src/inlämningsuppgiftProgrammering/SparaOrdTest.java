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

        assertTrue(rad2.ärGiltigText("Hej!"));
    }

    @Test
    void testMedBlanktSvar(){
        TeckenOchRadräknare rad3 = new TeckenOchRadräknare();

        assertTrue(rad3.ärGiltigText(""));
    }

    @Test
    void testaStoppFunktion(){
        TeckenOchRadräknare rad4 = new TeckenOchRadräknare();

        assertTrue(rad4.stopp("stopp"));
        assertTrue(rad4.stopp("Stopp"));
    }
}
