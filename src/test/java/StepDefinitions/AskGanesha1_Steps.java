package StepDefinitions;

import Pages.AskGanesha1;
import context.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AskGanesha1_Steps {
	
	TestContext testContext;
	AskGanesha1 askganeshapage1;
	
	public AskGanesha1_Steps(TestContext testContext) {
		this.testContext = testContext;
		askganeshapage1 = testContext.getPageObjectManager().getAskGanesha1();
	}
	
	@Given("^I see the Love Link$")
	public void I_see_the_Love_Link() {
		System.out.println("Jai Ganesh Jee");
		askganeshapage1.I_see_the_Love_Link();
}

	@When("^I click on the Love Link$")
	public void I_click_on_the_Love_Link() {
        System.out.println("Jai Ganesh Jee");
        askganeshapage1.I_click_on_the_Love_Link();
		}

	@Then("^I confirm that the Love page is displayed$")
	public void I_confirm_that_the_Love_page_is_displayed() throws Exception {
		askganeshapage1.I_confirm_that_the_Love_page_is_displayed();

	}
	
	@Then("^I see the headers Askaquestiononlove and Compatibility report$")
	public void I_see_the_love_headers() throws Exception {
		askganeshapage1.I_see_the_love_headers();
		

	}

	
	
	

}
