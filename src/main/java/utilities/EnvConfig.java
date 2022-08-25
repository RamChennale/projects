package utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {

    static final Logger LOGGER = LoggerFactory.getLogger(EnvConfig.class);
    private static EnvConfig instance = null;
    private Properties properties;
    private  static String DEF_ENV = "QA";

    private EnvConfig() throws IOException {
        properties = new Properties();
        LOGGER.info("Load Env " + getEnv());
        properties.load(new FileInputStream("src/main/resources/environment"+getEnv()+".properties"));
    }

    public static EnvConfig getInstance(){

        if (instance == null){
            try {
                instance = new EnvConfig();
                }catch (IOException exception){
                LOGGER.error("problem while loading '{}' ", getEnv(), exception.getMessage());
            }
        }

        return instance ;
    }

    public String getValue(String key){
        return properties.getProperty(key);
    }

    public static String getEnv(){

        if (System.getProperty("env") != null)
            return System.getProperty("env");
        else
            return DEF_ENV;
        }
}
