package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccEntitlements {
	@Test(groups = "positiveTestcases")
	public void Validate_Entitlements(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").queryParam("start-date", "").queryParam("end-date", "").
			when().get("party").
			then().
			assertThat().statusCode(200).
			body("accountUuid", equalTo(" ")).
			body("accountName", equalTo(" ")).log().all();
	
	}
}
