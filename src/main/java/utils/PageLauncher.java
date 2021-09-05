package utils;

import com.thoughtworks.gauge.Step;

import java.util.concurrent.TimeUnit;

public class PageLauncher {

    public static String APP_URL = System.getenv("APP_URL_" + System.getenv("ENVIRONMENT"));

    @Step("Go to the home page")
    public void launchThePage() {
        Driver.webDriver.get(APP_URL);
        Driver.webDriver.manage().window().maximize();
        Driver.webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
