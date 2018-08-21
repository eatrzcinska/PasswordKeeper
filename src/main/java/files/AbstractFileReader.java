package files;

import java.io.File;

abstract class AbstractFileReader implements FilesReader {

    protected File getFile(String path) {

        if(path == null) {
            throw new IllegalArgumentException("May not be null!");
        }


        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(path).getFile());

    }
}
