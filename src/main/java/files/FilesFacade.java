package files;

import model.PasswordEntry;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FilesFacade {

    private FilesReader filesReader;

    // w fasadzie ustalam na sztywno z jakiego readera ma korzystać
    public FilesFacade() {
        filesReader = new ScannerReader();
    }


    // metoda która czyta pliki
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

}
