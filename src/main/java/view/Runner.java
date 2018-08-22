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
        while(true){
            askUser();
        }

    }

    public void askUser() {
        if (state == START_MENU) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add password, 2. Show password, 3. Finish program");
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
                state = FINISH_PROGRAM;
                return;
            }
        }

        if (state == ADD_PASSWORD) {
            System.out.println("You chose 1. Add password");
            System.out.println("Give website");
            String website = scanner.nextLine();
            System.out.println("Give login");
            String login = scanner.nextLine();
            System.out.println("Give number of letters");
            int number = Integer.parseInt(scanner.next());
            System.out.println("Give type of generator");
            System.out.println("1. Lower and upper case, numbers, special characters");
            System.out.println("2. Lower and upper case, numbers");
            System.out.println("3.Lower and upper case");
            int answer = Integer.parseInt(scanner.nextLine());
            GeneratorType generator=null;
            if (answer == 1) {
                generator = GeneratorType.TYPE1;
                return;
            }
            if (answer == 2) {
                generator = GeneratorType.TYPE1;
                return;
            }
            if (answer == 3) {
                generator = GeneratorType.TYPE1;
                return;
            }
            FilesFacade filesFacade = new FilesFacade();
            List<String> listOfStrings = filesFacade.readFile("PasswordKeeper.txt");
            List<PasswordEntry> listOfObjects = filesFacade.getEntries("PasswordKeeper.txt");
            List<PasswordEntry> listaRekordow = new ArrayList<>();
            PasswordFacade ostateczny = new PasswordFacade();
            PasswordEntry rekord = ostateczny.generatePasswordEntry(
                    website,login,generator,number);
            listaRekordow.add(rekord);
            filesFacade.writeToFile("PasswordKeeper.txt",listaRekordow);
            state = START_MENU;
        }
        if (state == SHOW_PASSWORD) {

        }
        if (state == FINISH_PROGRAM) {
            System.out.println("Goodbye");
            return;
        }


    }


}
