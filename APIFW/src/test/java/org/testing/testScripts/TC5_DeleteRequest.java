package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC5_DeleteRequest {
	
	@Test
	public void testcase5() throws IOException {
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		
		HTTPMethods http = new HTTPMethods(pr);
		http.deleteParticularMethod("QA_URI", TC1_PostRequest.extractedIdValue);
	}

}
