package apichaining;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

//import io.restassured.response.Response;

public class CreateUser {
	
	@Test
	public void createUsers(ITestContext context) {
		
	Faker faker=new Faker();
	JSONObject data=new JSONObject();
	data.put("name", faker.name().fullName());
	data.put("gender", "Male");
	data.put("email", faker.internet().emailAddress());
	data.put("status", "active");
	
	String bearerToken= "67bca5138e437803d4cf555915e6797524a16a3923d9037d32bdc7bf432d0664";
	
	Response response = given()
	.header("Authorization","Bearer "+bearerToken)
	.contentType("application/json")
	.body(data.toString())
	
	
	.when()
	.post("https://gorest.co.in/public/v2/users");
	 response.then()
    .statusCode(201)
    .log().all();
	
	int id = response.jsonPath().getInt("id");
	
	
	 System.out.println("User created with id: "+id);
	
	 context.setAttribute("user_Id", id);
	 
	
	 
	 
	 
	}

}
