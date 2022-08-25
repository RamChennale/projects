package glueCode_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PartySearchGlue {

    @Given("get request body for {string} from service file {string}")
    public void get_request_body_for_from_service_file(String testID, String dataSource) {



    }
    @And("call partySearch API endpoint")
    public void call_party_search_api_endpoint() {

    }
    @Then("response code {int} should be received for {string}")
    public void response_code_should_be_received_for(Integer int1, String string) {

    }
}
