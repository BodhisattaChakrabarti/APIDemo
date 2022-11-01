package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace ap=new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(language);
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://rahulshettyacademy.com");
		ap.setName(name);
		
		List<String> myList=new ArrayList<>();
		myList.add("shoe park");
		myList.add("shop");
		ap.setTypes(myList);
		
		Location loc=new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		ap.setLocation(loc);
		
		return ap;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n  \"place_id\":\""+placeId+"\"\r\n}";
	}
	
	public String deletePlacePayloadDummyMethod(String placeId)
	{
		return "This is just a dummy method...";
	}
}
