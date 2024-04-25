package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {
	
	
	//input parameter: file path
	//purpose: load any properties
	//output parameter: return object of Properties
	public static Properties loadPropertiesFile(String Filepath) throws IOException {
		
		File f = new File(Filepath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
	}
	

}
