package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonHandle {
	
	
	//input parameter: json filepath
	//purpose: read the json data
	//output parameter: return json data in string form
	public static String readJsonData(String filepath) throws FileNotFoundException
	{
		File f = new File(filepath); //connection
		FileInputStream fr = new FileInputStream(f); // stream obj
		JSONTokener js = new JSONTokener(fr); //tokener obj
		JSONObject j = new JSONObject(js);
		return j.toString();
		
		
	}
}
