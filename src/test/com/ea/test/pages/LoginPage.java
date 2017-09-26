package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.controls.elements.HyperLink;
import com.ea.framework.utilities.WebDriverExtension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='header_logo']/a/img")
    private WebElement HomePageLogo;

    @FindBy(how = How.XPATH, using = ".//*[@title='Log in to your customer account']")
    private WebElement SignInLink;

    @FindBy(how = How.XPATH,using = ".//*[@id='center_column']/h1[@class='page-heading']")
    private WebElement TxtPresentInLoginPage;

    @FindBy(how = How.XPATH,using = ".//*[@id='email']")
    private WebElement Username;

    @FindBy(how = How.XPATH,using = ".//*[@id='passwd']")
    private WebElement Password;

    @FindBy(how = How.XPATH,using = ".//*[@id='SubmitLogin']")
    private WebElement ClickSignInBtn;

    @FindBy(how = How.XPATH,using = ".//*[@title='View my customer account']/span")
    private WebElement HomePageUserName;

    @FindBy(how = How.XPATH,using = "//*[@title='Log me out']")
    private WebElement Signout;

    public boolean IsLogoDisplayed() {
        return HomePageLogo.isDisplayed();
    }

    public boolean IsSignInDispalyed()

    {
        return SignInLink.isDisplayed();
    }

    public void ClickSignInLink()
    {
        SignInLink.click();
    }

    public boolean IsAUthTxtPresent()
    {
        return TxtPresentInLoginPage.isDisplayed();
    }

    public void ValidLogin(String username,String pass)
    {
        WebDriverExtension.scrollingByCoordinatesofAPage(0,180);
        Username.clear();
        Username.sendKeys(username);
        Password.clear();
        Password.sendKeys(pass);
    }

    public void ClickLoginBtn()
    {
        ClickSignInBtn.click();

    }

    public boolean IsUserNameDisplayed()
    {
       return HomePageUserName.isDisplayed();
    }

    public void SignOut()
    {
        Signout.click();
    }
}
