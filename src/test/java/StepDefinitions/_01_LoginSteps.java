package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
      
        GWD.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        //System.out.println("username ve password girildi");  


        dc.mySendKeys(dc.username, "*****");
        dc.mySendKeys(dc.password, "***********");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

         dc.verifyContainsText(dc.txtTechnoStudy,"Techno Study");

       
    }

}
