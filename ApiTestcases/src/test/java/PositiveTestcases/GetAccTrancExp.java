package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAccTrancExp {
	@Test(groups = "positiveTestcases")
	public void Validate_AcctranscExp(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").queryParam("asset-uuid", "").queryParam("filter", "").queryParam("date-type", "").
	queryParam("start-date", "").queryParam("end-date", "").queryParam("include-canclled", "").
	header("Authorization", "Bearer " + "token").
			when().get("account/{uuid}/transactions").
			then().
			assertThat().statusCode(200).
			body("url", equalTo(" ")).
			body("name", equalTo(" ")).log().all();
	
	}
}
