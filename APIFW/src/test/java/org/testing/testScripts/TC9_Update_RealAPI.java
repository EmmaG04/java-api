package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonHandle;
import io.restassured.response.Response;

public class TC9_Update_RealAPI {
	
	@Test
	public void testcase9() throws IOException {
		
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		String jsonRequestBody = jsonHandle.readJsonData("../APIFW/src/test/java/org/testing/resources/inputRequestForUpdateForRealAPI.json");
		HTTPMethods http = new HTTPMethods(pr);
		Response resObj = http.putMethod(jsonRequestBody, "Real_URI", "2");
		
	}


}