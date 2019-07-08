package context;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.Context;


public class ScenarioContext {
	
private static Map<String, Object> scenarioContext;
	
	public ScenarioContext() {
		scenarioContext = new HashMap<String, Object>();
		
	}
	
	public static Object getContext(Context key) {
		return scenarioContext.get(key.toString());
		
	}
	
	public static void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}
	
	public static Boolean isContains(Context notdeleted) {
		return scenarioContext.containsKey(notdeleted.toString());
	}


}
