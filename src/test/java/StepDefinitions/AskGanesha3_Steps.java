package StepDefinitions;

import org.junit.Assert;

import Pages.AskGanesha3;
import context.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AskGanesha3_Steps {
	TestContext testContext;
	AskGanesha3 askganeshapage3;
	
	public AskGanesha3_Steps(TestContext testContext) {
		this.testContext = testContext;
		askganeshapage3 = testContext.getPageObjectManager().getAskGanesha3();
	}
	
	@Given("^I am on the AskGanesha Puja Page$")
	public void I_am_on_the_AskGanesha_Puja_Page() {
		System.out.println("Jai Ganesh Jee");
		askganeshapage3.I_am_on_the_AskGanesha_Puja_Page();
		
    }
	
	@When("^I see the GauriShankar Puja Link$")
	public void I_see_the_GauriShankar_Puja_Link() {
       System.out.println("Jai Ganesh Jee");
       askganeshapage3.I_see_the_GauriShankar_Puja_Link();
		
	}
	
	@And("^I see the Ladoo Gopal Maha Anusthan Link$")
	public void I_see_Ladoo_Gopal_Maha_Anusthan_Link() {
       System.out.println("Jai Ganesh Jee");
       askganeshapage3.I_see_Ladoo_Gopal_Maha_Anusthan_Link();
		
   }
	
	@Then("^I confirm that AskGaneshaPuja Page is displayed correctly$")
	public void I_confirm_that_Ask_Ganesha_Puja_Page_is_displayed_correctly() throws Exception {
		System.out.println("Jai Ganesh Jee");
		askganeshapage3.I_confirm_that_Ask_Ganesha_Puja_Page_is_displayed_correctly();
		
	}
	
	

}
