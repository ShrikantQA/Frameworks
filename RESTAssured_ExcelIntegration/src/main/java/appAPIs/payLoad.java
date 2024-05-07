package appAPIs;

public class payLoad {

	//you can call any method from class to your testcase by giving classname.method name if that method name is defined as static
	public static String getPostData()
	{
	
		String b ="{"+
				  "\"location\": {"+
				    "\"lat\": -33.8669710,"+
				    "\"lng\": 151.1958750"+
				  "},"+
				  "\"accuracy\": 50,"+
				  "\"name\": \"Shoes!\","+
				  "\"phone_number\": \"(02) 9374 4000\","+
				  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				  "\"types\": [\"shoe_store\"],"+
				  "\"website\": \"/\","+
				  "\"language\": \"en-AU\""+
				"}";
		
		
		return b;
	}
	public static String createPlaceData()
	{;
		String b="";
	return b;
	}
}
