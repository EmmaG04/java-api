package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC6_GetAll_RealAPI {
	
	@Test
	public void testcase6() throws IOException {
		
		Properties pr = PropertiesHandle.loadPropertiesFile("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		http.getAllMethod("Real_URI");
	}

}
