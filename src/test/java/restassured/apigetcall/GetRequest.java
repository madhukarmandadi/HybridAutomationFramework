package restassured.apigetcall;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GetRequest {

	@Test(description = "get List of Users")
	public void getUsers() {

		Response response = given().
							when().
							get("https://reqres.in/api/users?page=2");
		int statusCode = response.statusCode();
		String jsonBody = response.body().asString();

		System.out.println("status code:" + statusCode);
		System.out.println("jsonBody:" + jsonBody);
		
		assertEquals(statusCode, 200);

		System.out.println("status code:" + statusCode);
		System.out.println("jsonBody:" + jsonBody);
		Object path = response.path("total");
		
		assertEquals(statusCode, response.statusCode());
		assertEquals(path, 12);
	}
	
	@Test(description = "get List of Users with Query params")
	public void getUsersWithQueryParam() {

		Response response = given().
							queryParam("page", 4).
							when().
							get("https://reqres.in/api/users");
		
		String jasonBody = response.body().asString();
		
		System.out.println("jasonBody:"+jasonBody);
		
	}
	
}















