package files;

import model.PasswordEntry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.List;


class PasswordEntryFileWriter {

    void writeToFile(String path, List<PasswordEntry> passwordEnt) {
        ClassLoader classLoader = getClass().getClassLoader();

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
        } catch (IOException e) {
            System.out.println("You cannot create a file");
        }

        PrintWriter writer = new PrintWriter(fileWriter);
        for (PasswordEntry line : passwordEnt) {
            writer.println(line.toStringToFile());
        }
        writer.flush();
    }

}
