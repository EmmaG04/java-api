package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String extractedIdValue;
	
	@Test
	public void testcase1() throws IOException {
		
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		String jsonRequestBody = jsonHandle.readJsonData("../APIFW/src/test/java/org/testing/resources/inputRequest.json");
		Random r = new Random();
		Integer intValue = r.nextInt();
		jsonRequestBody = jsonReplacement.assignValue(jsonRequestBody, "id", intValue.toString());
		HTTPMethods http = new HTTPMethods(pr);
		Response resObj = http.postMethod(jsonRequestBody, "QA_URI");
		extractedIdValue = jsonParsingUsingJsonPath.doParsing("id", resObj);
	}

}
