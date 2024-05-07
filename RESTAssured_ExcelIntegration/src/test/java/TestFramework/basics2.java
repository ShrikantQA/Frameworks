package TestFramework;
import org.testng.annotations.Test;

import appAPIs.payLoad;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class basics2 {

	
	@Test
	public void createPlaceAPI()
	{
		RestAssured.baseURI="https://appurl";
		given().
		
		queryParam("key","poiuhheggfdbaeFKDJejfaiefhoesa").
		body(payLoad.createPlaceData()).
		when().
		post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));
		
	// Create a place =response (place id)
		
		// delete Place = (Request - Place id)	
		

	}
}
