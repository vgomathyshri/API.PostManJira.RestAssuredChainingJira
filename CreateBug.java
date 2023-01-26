package week4.day1.jirachaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateBug extends JiraBase {
	@Test
	public void createBug() {
		
		
		
		File inputfile = new File("./src/main/resources/CreateBug.json");
			
		response = inputRequest.contentType("application/json").when().body(inputfile).post();
		bugId = response.jsonPath().get("id");
		key = response.jsonPath().get("key");
		
		System.out.println("BugId"+ bugId);
		System.out.println("key "+ key);
		
		response.prettyPrint();
			

	
	}
}
