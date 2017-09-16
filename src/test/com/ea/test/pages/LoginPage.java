package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import com.ea.framework.controls.elements.HyperLink;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='header_logo']/a/img")
    private WebElement ImgLogo;

    @FindBy(how = How.CSS, using = ".//*[@class='login']")
    private WebElement SignInTxt;

    @FindBy(how = How.XPATH, using = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private HyperLink SignInLink;

    @FindBy(how = How.XPATH,using = ".//*[@id='columns']/div[1]/span[2]")
    private WebElement TxtAuthentication;

    @FindBy(how = How.XPATH,using = ".//*[@id='email']")
    private WebElement Username;

    @FindBy(how = How.XPATH,using = ".//*[@id='passwd']")
    private WebElement Password;

    @FindBy(how = How.XPATH,using = ".//*[@id='SubmitLogin']")
    private WebElement SubmitSIgn;

    @FindBy(how = How.XPATH ,using = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private WebElement TxtUsername;

    public void ImageLogoHomepage()
    {
        ImgLogo.isDisplayed();
    }
    public String GetSigninText()
    {
        return SignInTxt.getText();
    }

    public void GoLogin()
    {
        SignInLink.click();
    }

    public void GetAuthText()
    {
        TxtAuthentication.isDisplayed();
    }

    public void LoginDetails(String username,String passwd)
    {
        Username.clear();
        Username.sendKeys(username);
        Password.clear();
        Password.sendKeys(passwd);

    }

    public void ClickLoginButton(){
        SubmitSIgn.click();
    }
    public String GetLoggenUsername()
    {
       return TxtUsername.getText();
    }
}
