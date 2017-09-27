package com.ea.test.steps;

import com.cucumber.listener.Reporter;
import com.ea.framework.base.Base;
import com.ea.framework.base.DriverContext;
import com.ea.framework.utilities.WebElementExtension;
import com.ea.test.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class LoginSteps extends Base {
    @When("^I Open Website$")
    public void iOpenWebsite() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
    }

    @Then("^I  Check PageTitle as My Store$")
    public void iCheckPageTitleAsMyStore() throws Throwable {
        try {
            Assert.assertEquals("Wrong Page title", "My Store", DriverContext.Driver.getTitle());
        } catch (Exception e) {
            Reporter.addStepLog("Wrong Title");
        }
    }

    @And("^I See HomePage Logo$")
    public void iSeeHomePageLogo() throws Throwable {

        CurrentPage.As(LoginPage.class).IsLogoDisplayed();
    }

    @And("^I See SignIn Link$")
    public void iSeeSignInLink() throws Throwable {

        CurrentPage.As(LoginPage.class).IsSignInDispalyed();
    }

    @Then("^I click on SignIn Link for LoginPage$")
    public void iClickOnSignInLinkForLoginPage() throws Throwable {
       CurrentPage.As(LoginPage.class).ClickSignInLink();
    }

    @And("^I Check LoginPage Title$")
    public void iCheckLoginPageTitle() throws Throwable {

        CurrentPage.As(LoginPage.class).GetLoginPageTitle();
    }

    @And("^I Check Authentication Text is Display$")
    public void iCheckAuthenticationTextIsDisplay() throws Throwable {
        
        CurrentPage.As(LoginPage.class).IsAUthTxtPresent();
    }

    @Then("^I Enter Correct UserName and Password$")
    public void iEnterCorrectUserNameAndPassword(DataTable data) throws Throwable {

        List<List<String>> table = data.raw();
       CurrentPage.As(LoginPage.class).ValidLogin(table.get(1).get(0),table.get(1).get(1));
    }

    @And("^I click SignIn Button$")
    public void iClickSignInButton() throws Throwable {
        CurrentPage.As(LoginPage.class).ClickLoginBtn();
    }

    @Then("^I see UserName on HomePage$")
    public void iSeeUserNameOnHomePage() throws Throwable {

        CurrentPage.As(LoginPage.class).IsUserNameDisplayed();
    }

    @When("^I Click on SignOut Link$")
    public void iClickOnSignOutLink() throws Throwable {
      CurrentPage.As(LoginPage.class).SignOut();
    }

    @Then("^I Enter Blank UserName and Password$")
    public void iEnterBlankUserNameAndPassword(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();
        CurrentPage.As(LoginPage.class).ValidLogin(data.get(1).get(0),data.get(1).get(1));

    }

    @And("^I See An Email Address is Required Validation Error$")
    public void iSeeAnEmailAddressIsRequiredValidationError() throws Throwable {

        CurrentPage.As(LoginPage.class).ValidationErrorBlankFields();
    }

    @Then("^I Enter Right Username and Wrong Password$")
    public void iEnterRightUsernameAndWrongPassword(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();
        CurrentPage.As(LoginPage.class).ValidLogin(data.get(1).get(0),data.get(1).get(1));
    }

    @And("^I See Authentication failed Error Mesage$")
    public void iSeeAuthenticationFailedErrorMesage() throws Throwable {
       CurrentPage.As(LoginPage.class).ValidationErr();
       Thread.sleep(2000);
    }

    @Then("^I Enter Wrong Username and Right Password$")
    public void iEnterWrongUsernameAndRightPassword(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        CurrentPage.As(LoginPage.class).ValidLogin(data.get(1).get(0),data.get(1).get(1));
    }
}
