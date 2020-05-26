package infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class SlfTestLogger implements TestLogger {


    @Override
    public void log(String msg)
    {
        Logger logger = Logger.getLogger("");
        logger.log(new LogRecord(Level.INFO,msg));
    }

}
