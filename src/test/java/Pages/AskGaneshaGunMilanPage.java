package Pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;


import runnersandhooks.Hooks;

public class AskGaneshaGunMilanPage {
	public By txtBoyName = By.xpath("//input[@name='bname']");
	public By hdrBoyDetails = By.xpath("//h1[@class='pb15']");
	public By txtBoyBirthCity = By.xpath("//input[@id='bcity']");
	public By hdrGirlsDetails = By.xpath("//h2");
	public By txtGirlName = By.xpath("//input[@name='gname']");
	public By txtGirlBirthCity = By.xpath("//input[@id='gcity']");
	
	public void I_see_the_Boy_Details_Sub_Header() {
		Assert.assertTrue(Hooks.ChromeDriver5.findElement(hdrBoyDetails).isDisplayed()==true);
		
	}
	
	public void I_see_the_Girl_Details_Sub_Header() {
		 
		Assert.assertTrue(Hooks.ChromeDriver5.findElement(hdrGirlsDetails).isDisplayed()==true);
	}
	
	 public void I_enter_the_Boy_Details_using_excel() throws Exception  {
		 String Name = Utilities.ExcelReader.read_data_from_Excel("C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\resources\\GunMilan.xlsx", 1, 0);
		 String BirthCity = Utilities.ExcelReader.read_data_from_Excel("C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\resources\\GunMilan.xlsx", 1, 1);
		 Hooks.ChromeDriver5.findElement(txtBoyName).sendKeys(Name);
		 Hooks.ChromeDriver5.findElement(txtBoyBirthCity).sendKeys(BirthCity);
			
			
		}
	 
 public void the_details_are_displayed_successfully() {
		 
		 System.out.println("Jai Ganesh jee");
			
			
		}
 
 public void I_enter_the_Girl_Details_using_excel() throws Exception   {
	 String GirlName = Utilities.ExcelReader.read_data_from_Excel("C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\resources\\GunMilan.xlsx", 1, 2);
	 String GirlBirthCity = Utilities.ExcelReader.read_data_from_Excel("C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\resources\\GunMilan.xlsx", 1, 3);
	 Hooks.ChromeDriver5.findElement(txtGirlName).sendKeys(GirlName);
	 Hooks.ChromeDriver5.findElement(txtGirlBirthCity).sendKeys(GirlBirthCity);
	 Hooks.close_browser(Hooks.ChromeDriver5);
		
		
	}
 
 public void I_enter_the_Boy_Details() throws Exception, ParseException {
	 String Name = Utilities.JsonReader.readJSONData("Boy FullName");
	 String BirthCity = Utilities.JsonReader.readJSONData("Boy Birth City");
	 Hooks.ChromeDriver5.findElement(txtBoyName).sendKeys(Name);
	 Hooks.ChromeDriver5.findElement(txtBoyBirthCity).sendKeys(BirthCity);
		
		
	}
 
 public void I_enter_the_Girls_Details() throws Exception  {
	 String Name = Utilities.JsonReader.readJSONData("Girl FullName");
	 String BirthCity = Utilities.JsonReader.readJSONData("Girl Birth City");
	 Hooks.ChromeDriver5.findElement(txtGirlName).sendKeys(Name);
	 Hooks.ChromeDriver5.findElement(txtGirlBirthCity).sendKeys(BirthCity);
	 Hooks.close_browser(Hooks.ChromeDriver5);
		
		
	}
	
	
	

}
