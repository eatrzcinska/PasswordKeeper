package generator;

public class PasswordGeneratorFacade {

    public PasswordGeneratorFactory factory;

    public PasswordGeneratorFacade(){
        factory = new PasswordGeneratorFactory();
    }

    public String getPassword (int amountOfLetters, GeneratorType type){
        return factory.getGenerator(type).generatePassword(amountOfLetters);
    }


}
