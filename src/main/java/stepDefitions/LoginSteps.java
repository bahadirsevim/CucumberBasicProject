package stepDefitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("go to amazon")
    public void go_to_amazon() {
        System.out.println("amazona gidildi.");
    }
    @When("click to submit button")
    public void click_to_submit_button() {
        System.out.println("Butona tıklandı.");
    }
    @Then("verify success message")
    public void verify_success_message() {
        System.out.println("giriş başarılı.");
    }

}
