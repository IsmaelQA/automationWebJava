package metodos;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import utils.EnvironmentProperties;


public class Base {
    public static WebDriver driver;


    public static void setDriver(String browserName) throws MalformedURLException {
        driver = Browser.setDriver(browserName);
    }

    public void visitUrl(String urlName) {
        String url = EnvironmentProperties.getValue(urlName);
        driver.manage().window();
        driver.get(url);
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static boolean isUrlContainsValue(String text) {
        return getUrl().contains(text);
    }


}
