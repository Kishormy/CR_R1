package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccHoldingsExp {
	@Test(groups = "positiveTestcases")
	public void ValidateGetAccHoldingsExp(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").queryParam("date", "").queryParam("filter", "").header("Authorization", "Bearer " + "token").
			when().get("account/{uuid}/holdings/export").
			then().
			assertThat().statusCode(200).
			body("url", equalTo(" ")).
			body("name", equalTo(" ")).log().all();
	
	}
}
