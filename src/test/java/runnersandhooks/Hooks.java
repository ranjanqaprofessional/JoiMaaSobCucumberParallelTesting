package runnersandhooks;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Managers.DriverManager;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver ChromeDriver1;
	public static WebDriver ChromeDriver2;
	public static WebDriver ChromeDriver3;
	public static WebDriver ChromeDriver4;
	public static WebDriver ChromeDriver5;
	
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

	
	
@Before("@First")
	
	public void I_launch_the_Browser_and_enter_url_for_AskGanesha() throws Exception{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
	 ChromeDriver1= new ChromeDriver();
	 ChromeDriver1.manage().window().maximize();
	 ChromeDriver1.manage().deleteAllCookies();
	ChromeDriver1.get("https://www.askganesha.com");
//	launch_driver(ChromeDriver1,"https://www.askganesha.com");
		
		
	
		}

@Before("@Second")

   
public void I_launch_the_Browser_and_enter_url_for_AskGanesha_for() throws Exception{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
	 ChromeDriver2= new ChromeDriver();
	 ChromeDriver2.manage().window().maximize();
	 ChromeDriver2.manage().deleteAllCookies();
	ChromeDriver2.get("https://www.askganesha.com");
//	launch_driver(ChromeDriver2,"https://www.askganesha.com");
		
		
	
		}

@Before("@Third")


public void I_launch_the_Browser_and_enter_url_for_AskGanesha_for_Puja() throws Exception{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
	 ChromeDriver3= new ChromeDriver();
	 ChromeDriver3.manage().window().maximize();
	 ChromeDriver3.manage().deleteAllCookies();
	ChromeDriver3.get("https://www.askganesha.com/puja/");
//	launch_driver(ChromeDriver3,"https://www.askganesha.com/puja/");
		
		
	
		}


@Before("@Fourth")


public void I_launch_the_Browser_and_enter_url_for_Kaanhai_Prince_PDF() throws Exception{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
	 ChromeDriver4= new ChromeDriver();
	 ChromeDriver4.manage().window().maximize();
	 ChromeDriver4.manage().deleteAllCookies();
	 ChromeDriver4.get("https://www.princexml.com/samples/");
  //launch_driver(ChromeDriver4,"https://www.princexml.com/samples/");
		
		
	
		}

@Before("@Seventh")


public void I_launch_the_Browser_and_enter_url_for_Ask_Ganesha_GunMIlan() throws Exception{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\RBHD3\\Downloads\\chromedriver.exe");
	 ChromeDriver5= new ChromeDriver();
	 ChromeDriver5.manage().window().maximize();
	 ChromeDriver5.manage().deleteAllCookies();
	 ChromeDriver5.get("https://www.askganesha.com/services/free_horoscope/gun-milan.asp");

		
		
	
		}

public static void close_browser(WebDriver Driver) throws Exception {
	Driver.close();
	
	
}
	


}
