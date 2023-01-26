package week4.day1.jirachaining;

import java.util.Stack;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraBase {
	
	public static String bugId;
	public static RequestSpecification inputRequest;
	public static Response response;
	public static String key;
	
	@BeforeMethod
	public void runJiraBase() {
	
		RestAssured.baseURI="https://gomathyshriv19.atlassian.net/rest/api/2/issue/";
		RestAssured.authentication= RestAssured.preemptive().basic("gomathyshri.v19@gmail.com", "wt2uY71omvjDhuufo4EBC5E9");
		inputRequest = RestAssured.given();
	}
}
