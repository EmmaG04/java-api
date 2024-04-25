package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonHandle;
import org.testing.utilities.jsonReplacement;
import io.restassured.response.Response;

public class TC4_PutRequest {
	
	@Test
	public void testcase4() throws IOException {
		
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		String jsonRequestBody = jsonHandle.readJsonData("../APIFW/src/test/java/org/testing/resources/inputRequestForUpdate.json");
		jsonRequestBody = jsonReplacement.assignValue(jsonRequestBody, "id", TC1_PostRequest.extractedIdValue);
		HTTPMethods http = new HTTPMethods(pr);
		Response resObj = http.putMethod(jsonRequestBody, "QA_URI",TC1_PostRequest.extractedIdValue);
		
	}

}
