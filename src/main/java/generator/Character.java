package generator;

import java.util.Random;

public class Character {

    Random random = new Random();

    char getLowerCase() {

        char letter = (char) (random.nextInt(25) + 97);

        return letter;
    }

    char getUpperCase() {

        char letter = (char) (random.nextInt(25) + 65);

        return letter;
    }

    char getNumber() {

        char number =String.valueOf(random.nextInt(9)).charAt(0);

        return number;
    }

    char getCharacter() {
        String chars = "!@#$%^&*+-";

        char specialCharacter = chars.charAt(random.nextInt(9));

        return specialCharacter;
    }

}
