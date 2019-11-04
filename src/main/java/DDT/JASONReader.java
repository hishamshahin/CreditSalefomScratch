package DDT;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JASONReader
{
	public String firstname,pass ; 

	public   void JsonReader() throws IOException, ParseException 
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\DDT\\UserData.jason.txt";

		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 

		for(Object jsonObj : jarray) 
		{
			JSONObject user = (JSONObject) jsonObj ; 
			firstname  = (String) user.get("usename"); 
			System.out.println(user);

			pass= (String) user.get("password"); 
			System.out.println(pass);		

		}

	}

}
