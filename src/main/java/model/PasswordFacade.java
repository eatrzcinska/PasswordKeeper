package model;

import generator.GeneratorType;
import generator.PasswordGeneratorFacade;

public class PasswordFacade {

    private PasswordGeneratorFacade passwordFacade = new PasswordGeneratorFacade();

    // tworzę metodę, która będzie zwracać poszczególne rekordy, korzystając z PasswordEntry

    public PasswordEntry generatePasswordEntry (String website, String login, GeneratorType type, int
            amountOfLetters){
        String password = passwordFacade.getPassword(amountOfLetters, type);
        PasswordEntry passEntrt = new PasswordEntry(website,password,login);
        passEntrt.toString();
        return passEntrt;
    }

}
