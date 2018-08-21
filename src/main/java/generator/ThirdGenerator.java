package generator;

import java.util.Random;

import static generator.GeneratorType.TYPE3;

// This class contains generator that accepts uppercase and lowercase letters.

class ThirdGenerator implements PasswordGenerator {

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
            }
            password += character;
        }
        System.out.println(password);
        return password;
    }

    @Override
    public GeneratorType getType() {
        return TYPE3;               //????
    }
}

