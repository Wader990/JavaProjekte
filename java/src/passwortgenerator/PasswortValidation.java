package passwortgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswortValidation {
    private String passwort;
    private static final int MAX_LENGTH = 10;
    private BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));


    public void passwortEingeben() throws IOException {
        System.out.println("Passwort Bitte eingeben");
        String input = reader.readLine();
        laengeTest(input);
        nummberTest(input);
    }


    public boolean laengeTest(String passwort) {

        if (passwort.length() > MAX_LENGTH) {
            System.out.println("die Länge stimmt nicht");
            return false;
        }

        return true;

    }

    public boolean nummberTest(String passwort) {

        if (passwort.matches("\\w+\\W.*")) {
            System.out.println("das Passwort enthalt Sonderzeichen und Zahlen");
            return true;
        }
        else {
            System.out.println("das Passwort enthalt keine Sonderzeichen oder Zahlen ");
            return false;
        }

    }






}
