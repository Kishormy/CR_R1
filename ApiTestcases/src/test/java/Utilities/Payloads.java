package Utilities;

public class Payloads {
	
	public static String addparty(){
		
		return  "{\r\n" + 
				"  \"uuid\": \"string\",\r\n" + 
				"  \"name\": \"string\",\r\n" + 
				"  \"partyNumber\": \"string\",\r\n" + 
				"  \"externalId\": \"string\",\r\n" + 
				"  \"contactDetails\": {\r\n" + 
				"    \"mobile\": {\r\n" + 
				"      \"countryCode\": \"string\",\r\n" + 
				"      \"number\": \"string\",\r\n" + 
				"      \"verified\": true\r\n" + 
				"    },\r\n" + 
				"    \"landLine\": {\r\n" + 
				"      \"countryCode\": \"string\",\r\n" + 
				"      \"number\": \"string\",\r\n" + 
				"      \"verified\": true\r\n" + 
				"    },\r\n" + 
				"    \"address\": {\r\n" + 
				"      \"line1\": \"string\",\r\n" + 
				"      \"line2\": \"string\",\r\n" + 
				"      \"line3\": \"string\",\r\n" + 
				"      \"city\": \"string\",\r\n" + 
				"      \"state\": \"string\",\r\n" + 
				"      \"country\": \"string\"\r\n" + 
				"    },\r\n" + 
				"    \"postalAddress\": {\r\n" + 
				"      \"line1\": \"string\",\r\n" + 
				"      \"line2\": \"string\",\r\n" + 
				"      \"line3\": \"string\",\r\n" + 
				"      \"city\": \"string\",\r\n" + 
				"      \"state\": \"string\",\r\n" + 
				"      \"country\": \"string\"\r\n" + 
				"    },\r\n" + 
				"    \"emailAddress\": {\r\n" + 
				"      \"address\": \"string\",\r\n" + 
				"      \"verified\": true\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
	}

}
