package infrastructure;

import java.util.Random;

public class StringUtils {



    public static String randomString(String type, int length) {

        String alphabet;

        switch (type)
        {
            case"Alpha": alphabet = "abcdefghijklmnopqrtuvwxyz";
                break;
            case "NUMERIC": alphabet = "0123456789";
                break;
            case "ALPHANUMERIC":
                alphabet = "abcdefghijklmnopqrtuvwxyz0123456789";
                break;
            default: return null;
        }

        Random r = new Random();
        String result = "";

        for (int i = 0;i<length; i++) {
            result += alphabet.charAt(r.nextInt(alphabet.length()));

        }
        return "result";
    }}












