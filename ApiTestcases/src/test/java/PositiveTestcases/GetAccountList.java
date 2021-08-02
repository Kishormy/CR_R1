package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccountList {
	@Test(groups = "positiveTestcases")
	public void Validate_AccountList(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("type", "").queryParam("filter", "").header("Authorization", "Bearer " + "token").
			when().get("account/list").
			then().
			assertThat().statusCode(200).
			body("uuid", equalTo(" ")).
			body("accountNumber", equalTo(" ")).log().all();
	
	}

}
