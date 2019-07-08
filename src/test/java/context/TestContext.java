package context;
import Managers.PageObjectManager;


public class TestContext {
	
	private PageObjectManager pageObjectManager;
	private ScenarioContext scenarioContext;
	
	public TestContext() {
		pageObjectManager = new PageObjectManager();
		scenarioContext = new ScenarioContext(); 
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}


}
