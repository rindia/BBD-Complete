package com.ea.test.steps;

import com.ea.framework.base.Base;
import com.ea.framework.base.DriverContext;
import com.ea.framework.config.Settings;
import com.ea.test.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.ea.framework.base.FrameworkInitialize.InitializeBrowser;

public class LoginSteps extends Base{
    @Given("^I open Website$")
    public void iOpenWebsite() throws Throwable {

     CurrentPage= GetInstance(LoginPage.class);
    }

    @Then("^I see Lo go on HomePage$")
    public void iSeeLoGoOnHomePage() throws Throwable {
        CurrentPage.As(LoginPage.class).ImageLogoHomepage();
    }



    @And("^I click on SignIn Link for Login$")
    public void iClickOnSignInLinkForLogin() throws Throwable {
        CurrentPage.As(LoginPage.class).GoLogin();
        Thread.sleep(3000);
    }

    @Then("^I See Authentication Text On Login page$")
    public void iSeeAuthenticationTextOnLoginPage() throws Throwable {
        CurrentPage.As(LoginPage.class).GetAuthText();
    }

    @And("^I Enter Username and password$")
    public void iEnterUsernameAndPassword(DataTable data) throws Throwable {
        List<List<String>> table = data.raw();
        CurrentPage.As(LoginPage.class).LoginDetails(table.get(1).get(0), table.get(1).get(1));
    }

    @Then("^I click SignIn Button$")
    public void iClickSignInButton() throws Throwable {
        CurrentPage.As(LoginPage.class).ClickLoginButton();
    }

    @And("^I see UserName on HomePage$")
    public void iSeeUserNameOnHomePage() throws Throwable {
        Assert.assertEquals("Invalid Username","Sign in",CurrentPage.As(LoginPage.class).GetLoggenUsername());
    }
}
