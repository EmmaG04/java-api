package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC10_Delete_RealAPI;
import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_DeleteRequest;
import org.testing.testScripts.TC6_GetAll_RealAPI;
import org.testing.testScripts.TC7_PostRequest_RealAPI;
import org.testing.testScripts.TC8_GetParticular_RealAPI;
import org.testing.testScripts.TC9_Update_RealAPI;

public class Runner {
	
	public static void main(String[] args) throws IOException {
		
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testcase1();
		
		TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
		tc2.testcase2();
		
		TC3_GetParticularRequest tc3 = new TC3_GetParticularRequest();
		tc3.testcase3();
		
		TC4_PutRequest tc4 = new TC4_PutRequest();
		tc4.testcase4();
		
		TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
		tc5.testcase5();
		
		TC6_GetAll_RealAPI tc6 = new TC6_GetAll_RealAPI();
		tc6.testcase6(); 
		
		TC7_PostRequest_RealAPI tc7 = new TC7_PostRequest_RealAPI();
		tc7.testcase7();
		
		TC8_GetParticular_RealAPI tc8 = new TC8_GetParticular_RealAPI();
		tc8.testcase8();
		
		TC9_Update_RealAPI tc9 = new TC9_Update_RealAPI();
		tc9.testcase9();
		
		TC10_Delete_RealAPI tc10 = new TC10_Delete_RealAPI();
		tc10.testcase10();
	}
	

}
