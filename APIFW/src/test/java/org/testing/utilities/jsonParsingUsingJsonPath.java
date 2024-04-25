package org.testing.utilities;

import io.restassured.response.Response;

//input parameter-- responseObject and jsonPath
//purpose-- it will parse from the response based upon jsonPath
//output-- it will return after extracting the value

public class jsonParsingUsingJsonPath {
	
	public static String doParsing(String jsonpath, Response res) {
		
		String extractedValue = res.jsonPath().get(jsonpath);
		return extractedValue;
		
	}

}
