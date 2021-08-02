package PositiveTestcases;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAllParties {
	
	@Test(groups = "positiveTestcases")
	public void Validate_GetAllParties(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("filter", "").queryParam("offset", "").queryParam("limit", "").
			when().get("parties").
			then().
			assertThat().statusCode(200).
			body("filter", equalTo(" ")).log().all();
	String response = given().log().all().queryParam("filter", "").queryParam("offset", "").queryParam("limit", "").
			when().get("parties").
			then().extract().response().toString();
	
	JsonPath js =new JsonPath(response);
	String uuid1 = js.getString("list[0].uuid");
	
	Assert.assertEquals(uuid1, "");
	}

}
