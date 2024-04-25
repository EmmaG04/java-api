package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC2_GetAllRequest {
	
	@Test
	public void testcase2() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		//String jsonInputBody = jsonHandle.readJsonData("../APIFW/src/test/java/org/testing/resources/inputRequest.json");
		
		
		HTTPMethods http = new HTTPMethods(pr);
		http.getAllMethod("QA_URI");
	}


}
