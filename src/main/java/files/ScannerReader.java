package files;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerReader extends AbstractFileReader {
    @Override
    public List read(String path) {

        List <String> list = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scaner = new Scanner(file);
            while (scaner.hasNextLine()){
            list.add(scaner.nextLine());
                System.out.println(list.get(0));
            }
        } catch (FileNotFoundException e) {
            return list;
        }

        return list;
    }
}
