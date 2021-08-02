package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class GetPartyDetailsByUUID {
	@Test(groups = "positiveTestcases")
	public void Validate_Party(){
	
	RestAssured.baseURI = "";
	
	given().log().all().queryParam("uuid", "").
			when().get("party").
			then().
			assertThat().statusCode(200).
			body("uuid", equalTo(" ")).
			body("partyNumber", equalTo(" ")).log().all();
	
	}

}
