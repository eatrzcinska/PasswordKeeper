package files;


import model.PasswordEntry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilesFacade {

    private FilesReader filesReader;
    private PasswordEntryFileWriter passEntFileWrit;


    // w fasadzie ustalam na sztywno z jakiego readera ma korzystać

    public FilesFacade() {
        filesReader = new ScannerReader();
        passEntFileWrit = new PasswordEntryFileWriter();
    }


    // metoda która czyta pliki i zapisuje linijka po linijce do listy
    public List<String> readFile(String path) {
        try {
            return filesReader.read(path);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }


    // funkcja do przechowywania w liscie obiektow przechowujacych zestaw danych poranych z pliku, oddzieloych
    // srednikami

    public List<PasswordEntry> getEntries (String path){
        try {
            return filesReader.getPasswordEntries(path);
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    public void writeToFile(String filename, List <PasswordEntry> passwordEntryList){
        passEntFileWrit.writeToFile(filename,passwordEntryList);
    }
  
}
