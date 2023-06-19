package metodos;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;


public class Base {
	public static WebDriver driver;
	
	
	

	public static void setDriver(String browserName) throws MalformedURLException {
		driver = Browser.setDriver(browserName);
	}

	public static void visitUrl(String urlName) {
		String url = EnvironmentProperties.getValue(urlName);
		driver.manage().timeouts();
		driver.get(url);
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static boolean isUrlContainsValue(String text) {
		return getUrl().contains(text);
	}



}
