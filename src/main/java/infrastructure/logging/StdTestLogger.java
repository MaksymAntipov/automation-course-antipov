package infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger {

    private int step = 1;

    public void log(String msg)
    {
        String LogEntry = "";

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = sdf.format(new Date());

        String methodName = Thread.currentThread().getName();
        LogEntry += step + ") " + time + "[" + methodName + "]" + msg;

        System.out.println(LogEntry);
        step ++;
    }

}