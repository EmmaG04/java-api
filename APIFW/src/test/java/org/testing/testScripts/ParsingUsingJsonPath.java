package org.testing.testScripts;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingUsingJsonPath {

	
	public static void main(String[] args) {
		
		Response res1 =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIBatchStudents");
		
		String fname = res1.jsonPath().get("[6].firstname");   
		System.out.println("Name is " +  fname);
		
		Response res2 =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/SeleniumBatchStudents");
		
		String street = res2.jsonPath().get("[2].Address[0].Street"); //for array of objects [2].Address[1].City
		System.out.println("City is " + street);
	}
}
