package files;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimesFileReader extends AbstractFileReader {
    @Override
    public List read(String path) {

        List <String> list = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scaner = new Scanner(file);
            while (scaner.hasNextLine()){
            list.add(scaner.nextLine());
            }
        } catch (FileNotFoundException e) {
            return list;
        }

        return list;
    }
}
