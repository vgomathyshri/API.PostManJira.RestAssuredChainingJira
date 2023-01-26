package week4.day1.jirachaining;

import org.testng.annotations.Test;



public class GetBug extends JiraBase {
	@Test(dependsOnMethods = "week4.day1.jirachaining.CreateBug.createBug")
	public void getBug() {
		
		response = inputRequest.when().get("/"+bugId);
		response.prettyPrint();
		
		
	}

}
