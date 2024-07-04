package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class mystepdef {

    @When("I perform a GET request with query parameters {string}")
    public void i_perform_a_get_request_with_query_parameters(String string) {
        System.out.println("Inside iPerformAGETRequestWithQueryParameters ");
    }
}
