package infrastructure;

public class ConfigurationManeger {

    public static String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
        String envVarValue = System.getenv(envVar);
       return envVarValue != null && !envVarValue.isBlank() ? envVarValue : defaultValue;
    }
}