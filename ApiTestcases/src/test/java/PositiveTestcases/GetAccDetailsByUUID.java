package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccDetailsByUUID {
	@Test(groups = "positiveTestcases")
	public void Validate_AccDetailsByUUID(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").header("Authorization", "Bearer " + "token").
			when().get("account").
			then().
			assertThat().statusCode(200).
			body("uuid", equalTo(" ")).
			body("accountNumber", equalTo(" ")).log().all();
	
	}
}
