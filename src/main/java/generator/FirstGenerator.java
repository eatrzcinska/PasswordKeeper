package generator;

import java.util.Random;

import static generator.GeneratorType.TYPE1;

// This class contains generator that accepts uppercase and lowercase letters, numbers and special characters.

class FirstGenerator implements PasswordGenerator {

    Random random = new Random();

    @Override
    public String generatePassword(int amountOfLetters) {
        String password = "";
        for (int i = 0; i < amountOfLetters; i++) {
            int index = random.nextInt(4);
            char character = 0;
            switch (index) {
                case 0:
                    character = new Character().getLowerCase();
                    break;
                case 1:
                    character = new Character().getUpperCase();
                    break;
                case 2:
                    character = new Character().getNumber();
                    break;
                case 3:
                    character = new Character().getCharacter();
                    break;
            }
            password += character;
        }
        //System.out.println(password);
        return password;
    }

    @Override
    public GeneratorType getType() {
        return TYPE1;               //????
    }
}

