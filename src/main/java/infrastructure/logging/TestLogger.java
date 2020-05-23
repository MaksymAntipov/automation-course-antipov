package infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {
    private int step = 0;


    protected String getEntry(String msg) {
        step ++;

        String logEntry = "";

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = sdf.format(new Date());

        String methodName = Thread.currentThread().getName();
        logEntry += step + ") " + time + "[" + methodName + "]" + msg;

        return logEntry;
    }

public abstract void log (String msg);


}
