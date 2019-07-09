package StepDefinitions;

import org.json.simple.parser.ParseException;

import Pages.AskGaneshaGunMilanPage;
import context.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AskGaneshaGunMilan_Steps {
	TestContext testContext;
	AskGaneshaGunMilanPage askganeshagunmilanpage;
	
	public AskGaneshaGunMilan_Steps(TestContext testContext) {
		this.testContext = testContext;
		askganeshagunmilanpage = testContext.getPageObjectManager().getAskGaneshaGunMilanPage();
	}
	
	@Given("^I see the Boy Details Sub Header$")
	 public void I_see_the_Boy_Details_SubHeader() throws Exception  {
	  askganeshagunmilanpage.I_see_the_Boy_Details_Sub_Header();
				
		}
	
	@When("^I enter the Boy Details using Excel$")
	 public void I_enter_the_Boy_Details_using_Excel() throws Exception  {
		askganeshagunmilanpage.I_enter_the_Boy_Details_using_excel();
	
				
		}
	
	@And("^I enter the Boy Details using Json$")
	 public void I_enter_the_Boy_Details_using_Json() throws ParseException, Exception {
		askganeshagunmilanpage.I_enter_the_Boy_Details_using_Json();
		
		}
	
	@Given("^I see the Girl Details Sub Header$")
	 public void I_see_the_Girl_Details_SubHeader() throws Exception  {
		
		askganeshagunmilanpage.I_see_the_Girl_Details_Sub_Header();
	
				
		}
	 
	 
	 
	 @When("^I enter the Girl Details using Excel$")
	 public void I_enter_the_Girl_Details_using_Excel() throws ParseException, Exception {
		 askganeshagunmilanpage.I_enter_the_Girl_Details_using_excel();
		
		}
	 
	 @And("^I enter the Girl Details using Json$")
	 public void I_enter_the_Girl_Details_using_Json() throws ParseException, Exception {
		 askganeshagunmilanpage.I_enter_the_Girls_Details_using_Json();
		
		}
	 
	 
	 
	 @Then("^the details are displayed successfully$")
	 public void details_are_displayed_successfully()  {
		 System.out.println("Jai Ganesh Jee");
		
		
		}

}
