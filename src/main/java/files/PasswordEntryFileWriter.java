package files;

import model.PasswordEntry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;


class PasswordEntryFileWriter {

    private static String PATH = "C:\\Users\\martr\\IdeaProjects\\PasswordManager\\storage";

    void writeToFile(String path, List<PasswordEntry> passwordEnt) {


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(Paths.get(PATH + "\\" + path).toFile(), false);
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
