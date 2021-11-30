package passwortgenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PasswortValidationTest {


    private PasswortValidation passwordVal = new PasswortValidation();

    @Test
    public void laengeTest() {
        String passwort = "wader12345";
        assertTrue(passwordVal.laengeTest(passwort));

        String passwort2 = "wader123456";
        assertFalse(passwordVal.laengeTest(passwort2));
    }

    @Test
    public void nummberTest() {
        String passwort = "wader12%";
        assertTrue(passwordVal.nummberTest(passwort));

        String passwort2 = "rrfgfg";
        assertFalse(passwordVal.nummberTest(passwort2));
    }

    @Test
    public void grossKleinTest() {
        String passwort = "erT2$";
        assertTrue(passwordVal.grossKleinTest(passwort));

        String passwort2 = "er2$";
        assertFalse(passwordVal.grossKleinTest(passwort2));
    }
}