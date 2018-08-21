import generator.FirstGenerator;
/*import generator.GeneratorType;
import generator.PasswordGeneratorFacade;
import generator.PasswordGeneratorFactory;
import java.util.Random;*/


public class Main {

    public static void main(String[] args) {
/*
        PasswordGeneratorFacade facade = new PasswordGeneratorFacade();
        GeneratorType[] types = GeneratorType.values();

        Random random = new Random();
        for (GeneratorType type : types) {
            int number = random.nextInt(10);
            String password = facade.getPassword(number, type);
            System.out.println(password);
        }*/

        FirstGenerator gener = new FirstGenerator();
        gener.generatePassword(10);

    }
}




/* class PassEntry
 * Long id;
 * String site;
 * String password;
 *
 * String to csvString(){
 * return id; site; password }*/
