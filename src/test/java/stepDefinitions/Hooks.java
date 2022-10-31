package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		// write code that will give you place id and execute this code only when place id is null
		StepDefinition sd=new StepDefinition();
		
		if(StepDefinition.place_id==null)
		{
			sd.add_place_payload_with("Hitler", "German", "Europe");
			sd.user_calls_with_http_request("AddPlaceAPI", "Post");
			sd.verify_place_id_created_maps_to_using("Hitler", "GetPlaceAPI");
		}
	}
}
