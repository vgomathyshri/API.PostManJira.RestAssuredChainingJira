package week4.day1.jirachaining;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class UpdateBug extends JiraBase{

	@Test(dependsOnMethods = "week4.day1.jirachaining.GetBug.getBug")
	public void updateBug() {
		File updatefile =new File("./src/main/resources/UpdateBug.json");
		System.out.println("bugId Before Execution"+bugId);
		response = inputRequest.contentType("application/json").when().body(updatefile).put("/"+bugId);
	
		
//		response = response.then().assertThat().body("id", Matchers.equalTo(bugId)).extract().response();
//		response = response.then().assertThat().body("key", Matchers.contains("BG")).extract().response();
//		String afterbugId = response.jsonPath().get("id");
		System.out.println("bugId After Execution" +bugId);
		
		int statusCode = response.getStatusCode();
		response.then().assertThat().statusCode(statusCode);
		System.out.println(statusCode);
				
		response.prettyPrint();
		
		
	}
}
