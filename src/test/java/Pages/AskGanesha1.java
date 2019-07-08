package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import Managers.DriverManager;
import runnersandhooks.Hooks;

public class AskGanesha1 {
	public By imgLove = By.xpath("//img[@src='https://www.askganesha.com/images-main-new/icon_love.jpg']");
	public By imgLoveAstrology = By .xpath("//span[text()='Love Astrology Services']");
	public By hdrAskaquestiononlove = By.xpath("//a[text()='Ask A Question on Love']");
	public By hdrCompatibilityReport = By.xpath("//a[text()='Compatibility Report']");
	
	public void I_see_the_Love_Link() {
		System.out.println("Jai Ganesh Jee");
        Assert.assertTrue(Hooks.ChromeDriver1.findElement(imgLove).isDisplayed() == true);

	}
	
	public void I_click_on_the_Love_Link() {
        System.out.println("Jai Ganesh Jee");
        Hooks.ChromeDriver1.findElement(imgLove).click();

	}
	
	public void I_confirm_that_the_Love_page_is_displayed() throws Exception {
         System.out.println("Jai Ganesh Jee");
         Assert.assertTrue(Hooks.ChromeDriver1.findElement(imgLoveAstrology).isDisplayed() == true);
         }

	
	public void I_see_the_love_headers() throws Exception {
		Assert.assertTrue(Hooks.ChromeDriver1.findElement(hdrAskaquestiononlove).isDisplayed() == true);
		Assert.assertTrue(Hooks.ChromeDriver1.findElement(hdrCompatibilityReport).isDisplayed() == true);
		Hooks.close_browser(Hooks.ChromeDriver1);
	}
}
