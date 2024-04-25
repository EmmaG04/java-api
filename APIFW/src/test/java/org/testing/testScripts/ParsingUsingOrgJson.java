package org.testing.testScripts;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingUsingOrgJson {
	
	public static void main(String[] args) {
		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/APIBatchStudents");
		
		/**
		 * For parsing single value (extraction)
		 
		JSONArray ja = new JSONArray(res.asString()); //Json Array object
		JSONObject jo = ja.getJSONObject(0); //Json Object object
		System.out.println(jo.get("id")); // Json object key**/
		
		/**
		 * For parsing multiple occurences of the key from the response
		JSONArray ja = new JSONArray(res.asString()); //Json Array object
		int L = ja.length();
		for (int i=0; i < L; i++) {
		JSONObject jo = ja.getJSONObject(i); //Json Object object
		System.out.println(jo.get("id")); // Json object key
		}
		**/
		
		/**For parsing all key values of the object
		JSONArray ja = new JSONArray(res.asString());
		JSONObject jo = ja.getJSONObject(0);
		Set<String> allkeys = jo.keySet();
		for( String s: allkeys) {
			System.out.println("The key name is " + s);
			System.out.println("The value is " + jo.get(s));
		}**/
		
		
		 //For parsing all the key values (objects) of the array
		JSONArray ja = new JSONArray(res.asString()); //Json Array object
		int L = ja.length();
		for (int i=0; i < L; i++) {
		JSONObject jo = ja.getJSONObject(i);
		Set<String> allkeys = jo.keySet();
		for( String s: allkeys) {
			System.out.println("The key name is " + s);
			System.out.println("The value is " + jo.get(s));
		}
		}
				
	}

}
