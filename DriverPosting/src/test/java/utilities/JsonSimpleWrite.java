package utilities;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleWrite {

	public static void main(String[] args) throws IOException {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Sankaralingam");
		jsonObject.put("Age", "30");
		
		JSONArray array=new JSONArray();
		array.add("Welcome");
		array.add("Not Used");
		
		jsonObject.put("Special Cases", array);
		
		FileWriter write=new FileWriter("Jsonwrite.json");
		write.write(jsonObject.toJSONString());
		write.close();
		
		
		
	}

}
