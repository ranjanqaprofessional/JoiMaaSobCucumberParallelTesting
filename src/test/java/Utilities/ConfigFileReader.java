package Utilities;

import java.io.FileInputStream;
import java.util.Properties;



public class ConfigFileReader {
	
public static Properties Prop;
	
	public static String Read_Properties(String Property) throws Exception  {
		 Prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\RBHD3\\eclipse-workspace\\JoiMaaSobPOM\\src\\test\\java\\Utilities\\config.properties");
		        Prop.load(ip);
		        String Key=Prop.getProperty(Property);
		        System.out.println(Key);
		        return Key;
		       
		       
		}
	
	
		 
		 public Boolean getBrowserWindowSize() {
			 String windowSize = Prop.getProperty("windowMaximize");
			 if(windowSize != null) return Boolean.valueOf(windowSize);
			 return true;
			 }

		 public long getImplicitlyWait() { 
			 String implicitlyWait = Prop.getProperty("implicitlyWait");
			 if(implicitlyWait != null) {
			 try{
			 return Long.parseLong(implicitlyWait);
			 }catch(NumberFormatException e) {
			 throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			 }
			 }
			 return 30; 
			 }

		
		 public String getDriverPath(){
			 String driverPath = Prop.getProperty("DriverPath");
			 if(driverPath!= null) return driverPath;
			 else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath"); 
			 }
		 
		 public String getReportConfigPath(){
				String reportConfigPath = Prop.getProperty("reportConfigPath");
				if(reportConfigPath!= null) return reportConfigPath;
				else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
			}
		 
		 public String getTestDataResourcePath(){
				String testDataResourcePath = Prop.getProperty("testDataResourcePath");
				if(testDataResourcePath!= null) return testDataResourcePath;
				else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");		
			}

}
