package passwortgenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class PasswortValidationTest {


    private PasswortValidation passwordVal = new PasswortValidation();
    @Test
    public void laengeTest(){
     String passwort = "wader123456";

     assertFalse(passwordVal.laengeTest(passwort));

     passwort = "wader12345";
     assertTrue(passwordVal.laengeTest(passwort));
    }

    @Test
    public void nummberTest(){
        String passwort = "wader12%";
        String passwort2  = "rrfgfg";
        assertTrue(passwordVal.nummberTest(passwort));
        assertFalse(passwordVal.nummberTest(passwort2));
    }

}