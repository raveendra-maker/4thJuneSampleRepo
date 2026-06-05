package apichaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;
//import org.json.JSONObject;
//import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetUser {
	
	@Test
	void test_GetUser(ITestContext context) {
		
		int id = (Integer) context.getAttribute("user_Id"); // Retrieve the user ID from the test context
		
		String bearerToken = "67bca5138e437803d4cf555915e6797524a16a3923d9037d32bdc7bf432d0664";
		
		given()
		.header("Authorization","Bearer "+bearerToken)
		.pathParam("id",id)
		
		.when()
		.get("https://gorest.co.in/public/v2/users/{id}")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
	

}
