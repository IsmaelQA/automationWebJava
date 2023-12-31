package metodos;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	  public static WebDriver driver;
	    private static ChromeOptions option;

	    public static WebDriver setDriver(String browser) throws MalformedURLException {
	        switch (browser) {
	            case "chromeHeadless":
	                option = new ChromeOptions();
	                option.addArguments("headless", "disable-gpu", "disable-popup-blocking", "no-sandbox",
	                        "start-maximized", "window-size=1920,1080", "disable-dev-shm-usage", "--ignore-certificate-errors");
	                driver = new ChromeDriver(option);
	                break;
	            case "firefox":
	                driver = new FirefoxDriver();
	                break;
	            case "chrome":
	                option = new ChromeOptions();
	                option.addArguments("start-maximized", "no-sandbox");
	                driver = new ChromeDriver(option);
	                break;
	            default:
	                option = new ChromeOptions();
	                option.addArguments("--start-maximized");
	                driver = new ChromeDriver(option);
	                break;
	        }
	        return driver;
	    }
}
