package infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger extends TestLogger{
    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter(new File("log.txt"),true);

            fw.write(getEntry(msg));

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
