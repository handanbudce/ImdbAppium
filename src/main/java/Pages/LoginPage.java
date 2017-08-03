package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public AccountPage signInWithIMDB(){
        click(By.name("Sign in with IMDb"));
        findElements(By.className("android.widget.EditText")).get(0).sendKeys("fobsolutionstask@hotmail.com");
        sendKeys(By.name("IMDb password"),"FobSolutions372");
        findElements(By.className("android.widget.Button")).get(0).click();
        return new AccountPage(driver);
    }

}