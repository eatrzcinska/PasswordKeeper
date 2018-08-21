import files.FilesFacade;
import files.LineFileReader;
import generator.GeneratorType;
import model.PasswordEntry;
import model.PasswordFacade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
/*
        FirstGenerator gener = new FirstGenerator();
        gener.generatePassword(10);*/

       /*ScannerReader nowy = new ScannerReader();
        nowy.read("facebook.txt");*/
        /* BufferedFileReader nowy2 = new BufferedFileReader();
        nowy2.read("facebook.txt");*/
      /*  LineFileReader nowy = new LineFileReader();
        try {
            nowy.read("facebook.txt");
            System.out.println(nowy.read("facebook.txt").toString());
        } catch (IOException e) {
            System.out.println("nie udalo sie uzyc lineFileReadera");
        }
*/
        /*PasswordFacade fasadka = new PasswordFacade();
        fasadka.generatePasswordEntry("face","emi", GeneratorType.TYPE1,10);*/

        FilesFacade fasadka = new FilesFacade();

        List<String> listOfStrings = fasadka.readFile("facebook.txt");
        System.out.println(listOfStrings.toString()); // domyslna metoda chyba

        List<PasswordEntry> listOfObjects = fasadka.getEntries("facebook.txt");
        listOfObjects.toString();

        List<PasswordEntry> listaRekordow = new ArrayList<>();

        PasswordEntry nowyRekord = new PasswordEntry("google","haslo","login");

        listaRekordow.add(nowyRekord);

        fasadka.writeToFile("text3.txt",listaRekordow);


    }
}




/* class PassEntry
 * Long id;
 * String site;
 * String password;
 *
 * String to csvString(){
 * return id; site; password }*/
