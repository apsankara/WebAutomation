package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleRead {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparse=new JSONParser();		
		FileReader reader=new FileReader("C:\\Automation\\WebAutomation\\LearningProject\\JsonFiles.json");
		Object parsdeobject=jsonparse.parse(reader);
		JSONObject jsonobject=(JSONObject)parsdeobject;
		String name=(String) jsonobject.get("Name");
		Long age=(Long)jsonobject.get("Age");
		System.out.println(name);
		System.out.println(age);
		
		JSONArray array= (JSONArray) jsonobject.get("Special Values");
		Iterator itrator=array.iterator();
		
		while(itrator.hasNext()) {
			System.out.println(itrator.next());
		}
		
	}

}
