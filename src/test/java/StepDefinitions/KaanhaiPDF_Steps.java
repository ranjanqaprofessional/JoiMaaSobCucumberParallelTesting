package StepDefinitions;

import org.junit.Assert;

import Pages.KaanhaiPDF;
import context.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KaanhaiPDF_Steps {
	TestContext testContext;
	KaanhaiPDF	kaanhaipdfpage;
	
	public KaanhaiPDF_Steps(TestContext testContext) {
		this.testContext = testContext;
		 kaanhaipdfpage=testContext.getPageObjectManager().getKaanhaiPDF();
		
	}
	
	@Given("^I see the KaanhaiPrince logo$")
	public void I_see_the_KaanhaiPrince_logo() {
		kaanhaipdfpage.I_see_the_KaanhaiPrince_logo();

	}

	@When("^I verify Dictioniary PDF link from KaanhaiPrince$")
	public void I_verify_Dictioniary_PDF_link_from_KaanhaiPrince() {
		kaanhaipdfpage.I_verify_Dictioniary_PDF_link_from_KaanhaiPrince();
		

	}

	@And("^I click on the link$")
	public void I_click_on_the_link() {
		kaanhaipdfpage.I_click_on_the_link();
		

	}

	@Then("^I confirm Kaanhaitext from PDF$")
	public void I_confirm_Kaanhaitext_from_PDF() throws Exception {
		kaanhaipdfpage.I_confirm_Kaanhaitext_from_PDF();
		

	}

}
