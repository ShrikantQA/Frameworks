package TestFramework;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;



public class basics5 {

	@Test
public void extractingNamesAPI()
{
		// TODO Auto-generated method stub

		//BaseURL or Host
		RestAssured.baseURI="apprul";
		
		Response res=given().
		       param("location","-35.8670522,151.1957362").
		       param("radius","500").
		       param("key","pppoijHJDNGGYRdsafasdfdsavhghe").log().all().
		       when().
		       get("/json").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		       body("results[0].name",equalTo("Sydney")).and().
		       body("results[0].place_id", equalTo("chdhuegskaeyrogfa$$")).and().
		       header("Server","pablo").log().body().
		       extract().response();
		   JsonPath js= ReusableMethods.rawToJson(res);
		   
		   int count=js.get("results.size()");
		   for(int i=0;i<count;i++)
		   {
			  System.out.println(js.get("results["+i+"].name"));
		   }
		   System.out.println(count);
		       
		       
		       /*header("dfd","fsdfds").
		       cookie("dsfs","csder").
		       body()*/
		//Status code of the response
		//Content type 
		//Body
		//Header responses
	
}

}
