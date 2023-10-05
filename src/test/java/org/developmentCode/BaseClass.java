package org.developmentCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    private String baseURL;


    BaseClass() throws IOException {

        String globalProperties = "/global.properties";
        String currentDIR = System.getProperty("user/dir");
        String fileLocation = currentDIR + globalProperties;
        FileInputStream fileInput = new FileInputStream(fileLocation);
        Properties prop = new Properties();
        prop.load(fileInput);
        this.baseURL=prop.getProperty("baseURL");


    }


    public String getBaseURL()
    {
      return baseURL;

    }

}
