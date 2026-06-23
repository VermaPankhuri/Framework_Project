package base;
import java.io.FileInputStream;

public class Base {

	public static void main(String[] args) throws Exception{
			Base base = new Base();
		System.out.println(base.getUrl());
		System.out.println(base.getBrowser());
	}
		public static WebDriver driver;

public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver1) {
	driver = driver1;
}
public String getUrl() throws Exception{
	Properties prop = new Properties();
	prop.load(new FileInputStream ("C:\\Users\\Sachin.7.Yadav\\eclipse-workspace\\Framework_Practice\\src\\main\\java\\data.properties"));
	return prop.getProperty("url");
}
public String getBrowser()throws Exception{
	Properties prop = new Properties();
	prop.load(new FileInputStream ("C:\\Users\\Sachin.7.Yadav\\eclipse-workspace\\Framework_Practice\\src\\main\\java\\data.properties"));
	return prop.getProperty("browser");
}

}
