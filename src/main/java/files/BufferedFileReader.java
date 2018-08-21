package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BufferedFileReader extends AbstractFileReader {
    @Override
    public List<String> read(String path) {

        File file = getFile(path);
        List<String> list = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line = bufferedReader.readLine();
            while(line!= null){
                list.add(line);
                line = bufferedReader.readLine();
                System.out.println(list.get(0));
            }
        } catch (IOException e1) {
            return list;
        }
        return list;
    }
}
