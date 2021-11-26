package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {


    private static String driverPath;
    private static String url;
    private static String username;
    private static String bad_login_password;
    private static String password;
    private static String first_name;
    private static String last_name;
    private static String postal_code;

    public static PropertyManager getInstance(){
        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();


        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driverPath = prop.getProperty("driverPath");
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        bad_login_password = prop.getProperty("bad_login_password");
        password = prop.getProperty("password");
        first_name = prop.getProperty("first_name");
        last_name = prop.getProperty("last_name");
        postal_code = prop.getProperty("postal_code");

        return instance;

    }
    public static void changeProperty (String key, String value){
        Properties newProp = new Properties();

        try {
            FileInputStream editfi = new
                    FileInputStream("src/main/resources/configuration.properties");
            newProp.load(editfi);
            newProp.setProperty(key, value);
            newProp.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public String getDriverPath(){
        return driverPath;
    }

    public String getUrl(){
        return url;
    }

    public String getUsername(){
        return username;
    }
    public String getBad_login_password(){
        return bad_login_password;
    }
    public String getPassword(){
        return password;
    }
    public String getFirst_name(){return first_name;}
    public String getLast_name(){return last_name;}
    public String getPostal_code(){return postal_code;}
}
