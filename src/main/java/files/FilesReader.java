package files;

import model.PasswordEntry;

import java.io.IOException;
import java.util.List;

interface FilesReader {

    // funkcja do czytania pliku i zapisywania go w liscie linijka po linijce
    List<String> read (String path) throws IOException;


    // funkcja do przechowywania w liscie obiektow przechowujacych zestaw danych poranych z pliku, oddzieloych
    // srednikami
    List <PasswordEntry> getPasswordEntries (String path) throws IOException;

}
