package generator;

interface PasswordGenerator {

    String generatePassword(int amountOfLetters);
    GeneratorType getType ();


}
