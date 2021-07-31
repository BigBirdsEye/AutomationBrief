package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

    @FindBy(how= How.ID, using = "email_create")
    public static WebElement registerEmail;

    @FindBy(how= How.ID, using = "SubmitCreate")
    public static WebElement createAccount;

    @FindBy(how= How.ID, using = "email")
    public static WebElement myEmail;

    @FindBy(how= How.ID, using = "passwd")
    public static WebElement passwd;

    @FindBy(how= How.ID, using = "SubmitLogin")
    public static WebElement login;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password")
    public static WebElement forgotPasswd;

    public void enter_email_address(String email){
        myEmail.sendKeys(email);
    }
    public void enter_password(String password){
        passwd.sendKeys(password);
    }
    public void create_account(){
        createAccount.click();
    }
    public void submit_login(){
        login.click();
    }
    public void register_email(){
        registerEmail.sendKeys();
    }
}
