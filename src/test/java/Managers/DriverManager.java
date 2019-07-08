package Managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Utilities.ConfigFileReader;

	
public class DriverManager {
	
	public static WebDriver ChromeDriver1;
	public static WebDriver ChromeDriver2;
	public static WebDriver ChromeDriver3;
	public static WebDriver ChromeDriver4;
//	
//
//	
	public static void launch_driver(WebDriver Driver,String URL) throws Exception {
		String Browser = Utilities.ConfigFileReader.Read_Properties("browser");
		 if(Browser == null || Browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",Utilities.ConfigFileReader.Read_Properties("driverPath"));
				Driver= new ChromeDriver();
				Driver.manage().window().maximize();
				Driver.manage().deleteAllCookies();
				Driver.manage().timeouts().pageLoadTimeout(26, TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
				Driver.get(URL);
				
			 
		 }
		 
		 else if(Browser.equalsIgnoreCase("iexplorer")) {
			 System.setProperty("webdriver.ie.driver", "C:\\Users\\RBHD3\\Downloads\\IEDriverServer.exe");
				Driver=new InternetExplorerDriver();
				Driver.manage().window().maximize();
				Driver.manage().deleteAllCookies();
				Driver.manage().timeouts().pageLoadTimeout(26, TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
			 
		 }
		
		
	}
//	
//	
//
//
//	
	public static  void quit_driver(WebDriver Driver) {
		Driver.close();
	}
	
}
