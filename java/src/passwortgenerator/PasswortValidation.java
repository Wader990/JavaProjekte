package passwortgenerator;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswortValidation {


    private String passwort;
    private static final int MAX_LENGTH = 10;
    private BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));


    public void passwortEingeben() throws IOException {
        ArrayList<String> passwoerter = new ArrayList<>();
        String input = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Passwort Bitte eingeben");
            input = reader.readLine();
            if (laengeTest(input) && nummberTest(input) && grossKleinTest(input)) {
                passwoerter.add(input);
            }
        }
        System.out.println(passwoerter);
    }

    public ArrayList<String> passwortArray() {
        ArrayList<String> passwoerterArray = new ArrayList<>();
        passwoerterArray.add("wader4%");
        passwoerterArray.add("abc3§");
        passwoerterArray.add("qwwe$7");
        passwoerterArray.add("zhjk");
        for (int i = 0; i < passwoerterArray.size(); i++) {
            if (!laengeTest(passwoerterArray.get(i)) || !nummberTest(passwoerterArray.get(i))) {
                System.out.println(passwoerterArray.get(i));
                return passwoerterArray;
            }
        }
        return null;
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
            return true;
        } else {
            System.out.println("das Passwort enthalt keine Sonderzeichen oder Zahlen ");
            return false;
        }

    }

    public boolean grossKleinTest(String passwort) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        for (int i = 0; i < passwort.length(); i++) {
            ch = passwort.charAt(i);
            if (Character.isUpperCase(ch)) {
                capitalFlag = true;

            }
            if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;

            }
            if(capitalFlag && lowerCaseFlag){
                return true;
            }
        }
        return false;
    }


}
