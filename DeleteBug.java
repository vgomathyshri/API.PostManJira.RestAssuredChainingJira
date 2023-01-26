package week4.day1.jirachaining;

import org.testng.annotations.Test;



public class DeleteBug extends JiraBase{
	@Test(dependsOnMethods = "week4.day1.jirachaining.GetBug.getBug")
	public void deleteBug() {
	response = inputRequest.delete("/"+bugId);
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	response.then().assertThat().statusCode(statusCode);	
	}

}
