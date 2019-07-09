package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import Managers.DriverManager;
import Utilities.EmailSender;
import runnersandhooks.Hooks;

public class AskGanesha3  {
	public By lnkGauriShankarPuja = By.xpath("//a[@href='https://www.askganesha.com/puja/gauri_shankar_puja.asp']");
	public By lnkLadooGopalMahaAnusthan = By.xpath("//a[text()='Maa Bhagwati Anushthan']//following::a[1]");
	
	public void I_am_on_the_AskGanesha_Puja_Page() {
		System.out.println("Jai Ganesh Jee");
       Assert.assertTrue(Hooks.ChromeDriver3.findElement(lnkGauriShankarPuja).isDisplayed() == true);

	}
	
	public void I_see_the_GauriShankar_Puja_Link() {
        System.out.println("Jai Ganesh Jee");
		Assert.assertTrue(Hooks.ChromeDriver3.findElement(lnkGauriShankarPuja).isDisplayed() == true);

	}
	
	public void I_see_Ladoo_Gopal_Maha_Anusthan_Link() {
        System.out.println("Jai Ganesh Jee");
		Assert.assertTrue(Hooks.ChromeDriver3.findElement(lnkLadooGopalMahaAnusthan).isDisplayed() == true);

	}
	
	public void I_confirm_that_Ask_Ganesha_Puja_Page_is_displayed_correctly() throws Exception {
		System.out.println("Jai Ganesh Jee");
		System.out.println(Hooks.ChromeDriver3.getCurrentUrl());
		Hooks.close_browser(Hooks.ChromeDriver3);
		EmailSender.send_Email_with_attachment("ranjan.seleniumtester@gmail.com", "ransfastgud2@gmail.com", "Jai Shri Krishna", "Radhe Radhe");

	}

}
