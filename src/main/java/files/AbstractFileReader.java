package files;

import model.PasswordEntry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class AbstractFileReader implements FilesReader {

    File getFile(String path) {

        if (path == null) {
            throw new IllegalArgumentException("May not be null!");
        }

        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(path).getFile());
    }


    // Nadpisanie metody z interfejsu - klasa abstrakcyjna nie musi tego robic, mogą to zrobić dopiero klasy
    // dziedziczące po klasie abstrakcyjnej, ale ma taką możliwość (wtedy klasy dziedziczące będą miały taką domyślną
    // implementację tej metody, którą oczywiście mogą nadpisać. Ja tutaj definiouję tę metodę)

    @Override
    public List<PasswordEntry> getPasswordEntries(String path) throws IOException {

        List<PasswordEntry> entryList = new ArrayList<>();
        List<String> list = read(path);

        for (String line : list) {
            String[] data = line.split(";");
            PasswordEntry entryObject = new PasswordEntry(data[0], data[1], data[2]);
            entryList.add(entryObject);
        }
        return entryList;
    }


    // Metoda read, której nie muszę tu podawać, bo jeśli metoda jest abstrakcyjna to nie trzeba wymieniać tu metody
    // z interfejsu, klasa dziedzicząca i tak będzie musiała ją nadpisać
    @Override
    public abstract List<String> read(String path) throws IOException;
}
