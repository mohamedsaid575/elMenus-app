package Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {

    Properties properties;

    public PropertiesConfig(){
        properties = new Properties();
        InputStream stream = getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(stream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //Identify Function to get (BaseURL & Email & Password) From Config File

    public String getBaseURL() {
        return properties.getProperty("baseURL") ;
    }

    public String getValidEmail() {
        return properties.getProperty("Email");
    }

    public String getValidPassword() {
        return properties.getProperty("Password");
    }
}
