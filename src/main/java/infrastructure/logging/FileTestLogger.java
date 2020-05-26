package infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger implements TestLogger{

    private String fileName = "";
    private static final String HEADER = "<html><head><title></title></head><body><ul>";
    private static final String FOOTER = "</ul></body></html>";

    public FileTestLogger()
    {
        fileName = "log_" + System.currentTimeMillis() + ".html";

        try {
            FileWriter fw = new FileWriter(new File(fileName), true);
            fw.write(HEADER);

            fw.close();
        }
        catch ( IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void log(String msg) {
        try {
            FileWriter fw = new FileWriter(new File("log.txt"),true);

            fw.write(msg+"\n");

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
