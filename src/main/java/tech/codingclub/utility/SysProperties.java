package tech.codingclub.utility;

import java.io.IOException;
import java.util.Properties;

public class SysProperties {
    private static Properties prop=null;
    private SysProperties(){

    }

    public static Properties getInstance() {
        if(prop==null){
            //singleton
            ClassLoader loader=SysProperties.class.getClassLoader();
            if(loader==null)
                loader=ClassLoader.getSystemClassLoader();
            String propFile="application.properties";
            java.net.URL url=loader.getResource(propFile);
            prop=new Properties();
            try {
                prop.load(url.openStream());
            } catch (IOException e) {
            }

        }
        return prop;
        }
public static String getPropertyValue(String Key){
        return SysProperties.getInstance().getProperty(Key);
}

    public static void main(String[] args) {
System.out.println(getPropertyValue("DB_PASSWORD"));
    }
}
