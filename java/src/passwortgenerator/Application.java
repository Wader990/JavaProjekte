package passwortgenerator;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        PasswortValidation obj = new PasswortValidation();
        obj.passwortEingeben();
    }
}
