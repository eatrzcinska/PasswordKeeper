package view;

import files.FilesFacade;
import generator.GeneratorType;
import model.PasswordEntry;
import model.PasswordFacade;

import javax.print.attribute.standard.Finishings;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.State.*;

public class Runner {

    State state = START_MENU;
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to PASSWORD KEEPER!");
        while(state!=FINISH_PROGRAM){
            askUser();
        }
        System.out.println("Goodbye!");
    }

    public void askUser() {
        if (state == START_MENU) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add password, 2. Show all passwords, 3. Remove password, 4. Finish program");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer == 1) {
                state = ADD_PASSWORD;
                return;
            }
            if (answer == 2) {
                state = SHOW_PASSWORD;
                return;
            }
            if (answer == 3) {
                state = REMOVE_PASSWORD;
                return;
            }
            if (answer == 4) {
                state = FINISH_PROGRAM;
                return;
            }
        }

        if (state == ADD_PASSWORD) {
            System.out.println("You have chosen 1. Add password");
            System.out.println("Give website");
            String website = scanner.nextLine();
            System.out.println("Give login");
            String login = scanner.nextLine();
            System.out.println("Give number of letters");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Give type of generator");
            System.out.println("1. Lower and upper case, numbers, special characters");
            System.out.println("2. Lower and upper case, numbers");
            System.out.println("3.Lower and upper case");
            int answer = Integer.parseInt(scanner.nextLine());
            GeneratorType generator=null;
            if (answer == 1) {
                generator = GeneratorType.TYPE1;
            } else if (answer == 2) {
                generator = GeneratorType.TYPE2;
            } else if (answer == 3) {
                generator = GeneratorType.TYPE3;
            }
            FilesFacade filesFacade = new FilesFacade();
            //List<String> listOfStrings = filesFacade.readFile("PasswordKeeper.txt");
            List<PasswordEntry> listOfObjects = filesFacade.getEntries("PasswordKeeper.txt");
            List<PasswordEntry> listaRekordow = new ArrayList<>(listOfObjects);
            PasswordFacade ostateczny = new PasswordFacade();
            PasswordEntry rekord = ostateczny.generatePasswordEntry(
                    website,login,generator,number);
            listaRekordow.add(rekord);
            filesFacade.writeToFile("PasswordKeeper.txt",listaRekordow);
            System.out.println("You have just added new password");
            state = START_MENU;
            return;
        }
        if (state == SHOW_PASSWORD) {
            System.out.println("You have chosen 2. Show all passwords");
            FilesFacade filesFacade = new FilesFacade();
            List<PasswordEntry> listOfObjects = filesFacade.getEntries("PasswordKeeper.txt");
            for(PasswordEntry line: listOfObjects){
                System.out.println(listOfObjects.indexOf(line)+". " + line);
            }
            state = START_MENU;
            return;
        }
        if (state == REMOVE_PASSWORD) {
            System.out.println("Which password would you like to remove? (Give a number)");
            int index = Integer.parseInt(scanner.nextLine());
            FilesFacade filesFacade = new FilesFacade();
            List<PasswordEntry> listOfObjects = filesFacade.getEntries("PasswordKeeper.txt");
            List<PasswordEntry> listaRekordow = new ArrayList<>(listOfObjects);
            listaRekordow.remove(index);
            filesFacade.writeToFile("PasswordKeeper.txt",listaRekordow);
            System.out.println("You have just removed a password");
            state = START_MENU;
            return;
        }


    }


}
