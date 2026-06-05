package apichaining;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

import com.github.javafaker.Faker;

//import io.restassured.response.Response;

public class UpdateUser {
	
	@Test
	public void Test_UpdateUsers(ITestContext context) {
		
	Faker faker=new Faker();
	JSONObject data=new JSONObject();
	data.put("name", faker.name().fullName());
	data.put("gender", "female");
	data.put("email", faker.internet().emailAddress());
	data.put("status", "inactive");
	
	String bearerToken= "67bca5138e437803d4cf555915e6797524a16a3923d9037d32bdc7bf432d0664";
	
	int id = (Integer) context.getAttribute("user_Id"); // Retrieve the user ID from the test context
	
	given()
	.header("Authorization","Bearer "+bearerToken)
	.contentType("application/json")
	.body(data.toString())
	.pathParam("id",id)
		
	.when()
	.put("https://gorest.co.in/public/v2/users{id}")
	
	 .then()
	.statusCode(200)
	.log().all();
	
	
	}

}
