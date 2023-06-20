package utils;

import java.util.Properties;

public class EnvironmentProperties {

	static final String PROPERTIESQA = "./src/test/resources/qa.properties";
	static final String PROPERTIESPROD = "./src/test/resources/prod.properties";
	
	static Properties properties;

	public static String getValue(String value) {
		String envirommentName = System.getProperty("enviromment");
		return Environment.getByName(envirommentName).getProp(value);
	}

	public static int getInt(String property) throws InvalidEnvironmentPropertyException {
		String environmentName = System.getProperty("enviromment");

		try{
			String value = Environment.getByName(environmentName).getProp(property);
			if(value == null){
				throw new InvalidEnvironmentPropertyException();
			}
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new InvalidEnvironmentPropertyException();
		}
	}
}
