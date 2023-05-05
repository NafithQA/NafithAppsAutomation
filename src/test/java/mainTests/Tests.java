package mainTests;

import base.AndroidCapsFile;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Tests extends AndroidCapsFile {

    String testName;

    @Test(enabled = true)
    public void randomScenario(Method method) {

        /// For the recorder
        testName = method.getName();
    }
}
