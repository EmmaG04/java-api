package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
Properties pr;
	
	public HTTPMethods(Properties pr) {
		this.pr = pr;
		
	}
	
	public Response postMethod(String requestBody, String UriKeyName) {
		
		String uriValue = pr.getProperty(UriKeyName);
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
		
		System.out.println("The status code is: " + res.statusCode());
		System.out.println("The response body is: ");
		System.out.println(res.asString());
		
		return res;
	}
	
   public void getAllMethod(String UriKeyName) {
		
		String uriValue = pr.getProperty(UriKeyName);
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("The status code is: " + res.statusCode());
		System.out.println("The response body is: ");
		System.out.println(res.asString());
	}
   
   public void getParticularMethod(String UriKeyName, String endpoint) {
		
		String uriValue = pr.getProperty(UriKeyName)+"/"+endpoint;
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("The status code is: " + res.statusCode());
		System.out.println("The response body is: ");
		System.out.println(res.asString());
	}
   
   public Response putMethod(String requestBody, String UriKeyName, String endpoint) {
		
		String uriValue = pr.getProperty(UriKeyName)+"/"+endpoint;
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(uriValue);
		
		System.out.println("The status code is: " + res.statusCode());
		System.out.println("The response body is: ");
		System.out.println(res.asString());
		
		return res;
	}

   public void deleteParticularMethod(String UriKeyName, String endpoint) {
		
		String uriValue = pr.getProperty(UriKeyName)+"/"+endpoint;
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		
		System.out.println("The status code is: " + res.statusCode());
		System.out.println("The response body is: ");
		System.out.println(res.asString());
	}
}

