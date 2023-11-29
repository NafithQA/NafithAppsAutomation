package helpers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataLoader {

    public String credentialsData(String key) throws IOException {

        FileReader reader =
                new FileReader(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "testData" + File.separator + "credentials");
        Properties p = new Properties();
        p.load(reader);

        return p.getProperty(key);
    }

}
