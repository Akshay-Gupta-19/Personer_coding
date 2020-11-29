package IOStreams;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class filestest {
    public static void main(String[] args) {
        File file = new File("D:/test/hello.txt");
        System.out.println(file.exists());
        boolean isFileCreated;
        try {
            isFileCreated=file.createNewFile();
            System.out.println("File created - "+isFileCreated);
        } catch (IOException ex) {
            Logger.getLogger(filestest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
