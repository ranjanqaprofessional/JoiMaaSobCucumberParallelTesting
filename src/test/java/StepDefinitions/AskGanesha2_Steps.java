package StepDefinitions;

import Pages.AskGanesha2;
import context.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AskGanesha2_Steps {
	
	TestContext testContext;
	AskGanesha2 askganeshapage2;
	
	public AskGanesha2_Steps(TestContext testContext) {
		this.testContext = testContext;
		askganeshapage2 = testContext.getPageObjectManager().getAskGanesha2();
	}
	
	@Given("^I see the GaneshJee Image$")
	public void I_see_the_GaneshJee_Image() {
		askganeshapage2.I_see_the_GaneshJee_Image();
	
	}

	@When("^I verify various elements on AskGanesha Landing Page$")
	public void I_verify_various_elements_on_AskGanesha_Landing_Page() {
		System.out.println("Jai Ganesh Jee");
		askganeshapage2.I_verify_various_elements_on_AskGanesha_Landing_Page();

	}

	@Then("^I confirm that user has reached the home page$")
	public void I_confirm_that_user_has_reached_the_home_page() throws Exception {
		System.out.println("Jai Ganesh Jee");
		askganeshapage2.I_confirm_that_user_has_reached_the_home_page();
		
		

	}
	
	

}
