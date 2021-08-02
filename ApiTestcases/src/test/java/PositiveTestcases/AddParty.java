package PositiveTestcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Payloads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AddParty {
	@Test(groups = "positiveTestcases")
	public void AddAndValidateParty(){
	
	RestAssured.baseURI = "";
	
	given().log().all().header("Content-type","application/json").body(Payloads.addparty()).
			when().post("party").
			then().
			assertThat().statusCode(200).
			body("uuid", equalTo(" ")).
			body("partyNumber", equalTo(" ")).log().all();
	
	
	String response = given().log().all().queryParam("filter", "").queryParam("offset", "").queryParam("limit", "").
			when().get("parties").
			then().extract().response().toString();
	
	JsonPath js =new JsonPath(response);
	String uuid1 = js.getString("list[0].uuid");
	
	Assert.assertEquals(uuid1, "");
	}

}
