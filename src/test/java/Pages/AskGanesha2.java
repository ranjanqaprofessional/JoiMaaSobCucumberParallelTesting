package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import Managers.DriverManager;
import runnersandhooks.Hooks;

public class AskGanesha2  {
	public By imgGaneshJee = By.xpath("//img[@src='https://www.askganesha.com/images/logo.png']");
	
	public void I_see_the_GaneshJee_Image() {
		Assert.assertTrue(Hooks.ChromeDriver2.findElement(imgGaneshJee).isDisplayed() == true);
	}
	
	public void I_verify_various_elements_on_AskGanesha_Landing_Page() {
		System.out.println("Jai Ganesh Jee");

	}
	
	public void I_confirm_that_user_has_reached_the_home_page() throws Exception {
		System.out.println("Jai Ganesh Jee");
		System.out.println(Hooks.ChromeDriver2.getCurrentUrl());
		Hooks.close_browser(Hooks.ChromeDriver2);

	}

}
