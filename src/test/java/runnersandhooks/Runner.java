package runnersandhooks;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\features\\AskGanesha1.feature",
//		"C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\features\\AskGanesha2.feature",
		"C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\features\\AskGanesha3.feature",
		"C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\features\\AskGaneshaGunMilan.feature"},
//		"C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\features\\KaanhaiPDF.feature"},
monochrome =true,
glue = "",
dryRun=false,
plugin = {"pretty","json:target/cucumber-json/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
 strict =true)


public class Runner {
	
	
	

	
	
	
	

}
