package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccountHoldings {
	@Test(groups = "positiveTestcases")
	public void ValidateAccountHoldings(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").queryParam("date", "").queryParam("filter", "").header("Authorization", "Bearer " + "token").
			when().get("account/{uuid}/holdings").
			then().
			assertThat().statusCode(200).
			body("assetUuid", equalTo(" ")).
			body("assetType", equalTo(" ")).log().all();
	
	}

}
