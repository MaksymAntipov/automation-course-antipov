package infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger extends TestLogger{
    @Override
    void log(String msg) {
        try {
            FileWriter fw = new FileWriter(new File("log.txt"),true);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
