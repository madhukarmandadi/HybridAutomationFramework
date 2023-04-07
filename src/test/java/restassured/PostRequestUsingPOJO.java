package restassured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PostRequestUsingPOJO {
	
	@Test
	public void testPojo() {
		
		Response response = given().get("https://reqres.in/api/users");
		Headers headers = response.headers();
		for (Header header : headers) {
			System.out.println(header.getName() +"::::"+ header.getValue());
		}
	}
	//header("content-type","application/json")
	@Test
	public void testPojoPost() {
		
		Response reponse = given().
				header("content-type",ContentType.JSON)
				.body("{\r\n"
				+ "    \"name\": \"madhukar\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").log().all().post("https://reqres.in/api/users");
		
		//reponse.prettyPrint();
		
		System.out.println(reponse.contentType());
		System.out.println(reponse.getStatusCode());
		
	}
	
	@Test
	public void testPojoPostWithString() {
		
		String reqBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		Response reponse = given().
				header("content-type",ContentType.JSON)
				.body(reqBody).log().all().post("https://reqres.in/api/users");
		
		//reponse.prettyPrint();
		
		System.out.println(reponse.contentType());
		System.out.println(reponse.getStatusCode());
		
	}
	
	@Test
	public void testPojoPostWithExternalFile() {
		
		Response reponse = given().
				header("content-type",ContentType.JSON)
				.body(new File(System.getProperty("user.dir")+"/test.json")).
				 log().
				 all().
				 post("https://reqres.in/api/users");
		
		//reponse.prettyPrint();
		
		System.out.println(reponse.contentType());
		System.out.println(reponse.getStatusCode());
		
	}

	@Test
	public void testPojoPostWithReadAllBytes() throws IOException {
		byte[] readAllBytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/test.json"));
		String reqBody = new String(readAllBytes);

		Response reponse = given().header("content-type", ContentType.JSON).body(reqBody)
				.post("https://reqres.in/api/users");
		reponse.prettyPrint();

		System.out.println(reponse.contentType());
		System.out.println(reponse.getStatusCode());
	}
	
	@Test
	public void testPojoPostWithLomback() throws IOException {
		Employee employee=new Employee();

		Response reponse = given()
				.header("content-type", ContentType.JSON)
				.body(employee)
				.post("https://reqres.in/api/users");
		
		reponse.prettyPrint();

		System.out.println(reponse.contentType());
		System.out.println(reponse.getStatusCode());
	}
}
