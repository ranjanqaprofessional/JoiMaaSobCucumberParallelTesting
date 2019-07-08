package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import runnersandhooks.Hooks;

public class KaanhaiPDF {
	public By imgKaahnaPrince = By.xpath("//img[@src='/images/Prince-logo.png']");
	public By linkPDFDictionary = By.xpath("//a[@href='http://css4.pub/2015/icelandic/dictionary.pdf']");
	
	public void I_see_the_KaanhaiPrince_logo() {
		Assert.assertTrue(Hooks.ChromeDriver4.findElement(imgKaahnaPrince).isDisplayed() == true);

	}
	
	public void I_verify_Dictioniary_PDF_link_from_KaanhaiPrince() {
		Assert.assertTrue(Hooks.ChromeDriver4.findElement(linkPDFDictionary).isDisplayed() == true);

	}
	
	public void I_click_on_the_link() {
		Hooks.ChromeDriver4.findElement(linkPDFDictionary).click();

	}
	
	public void I_confirm_Kaanhaitext_from_PDF() throws Exception {
		Utilities.PDFReader.verifyPDFContent(Hooks.ChromeDriver4, "Test");
		Hooks.close_browser(Hooks.ChromeDriver4);

	}

}
