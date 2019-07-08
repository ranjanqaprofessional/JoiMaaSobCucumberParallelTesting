package Utilities;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;	
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonReader {
	static String n;
	
	public static String readJSONData(String keyword) throws IOException, ParseException{
	
	Reader reader = new FileReader("C:\\Users\\RBHD3\\eclipse-workspace\\JaiSaiNath\\resources\\testdataresources\\GunMilan.json");
	JSONParser parser = new JSONParser();
	JSONArray jsonArr = (JSONArray)parser.parse(reader);
	for(Object obj : jsonArr){
	JSONObject jo = (JSONObject)obj;			
	n = (String)jo.get(keyword);
	}
	return n;
	}
	
}


