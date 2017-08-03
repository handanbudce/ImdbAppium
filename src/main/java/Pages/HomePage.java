package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public AccountPage goToMyAccount(){
        click(By.id("com.imdb.mobile:id/menu_account"));
        return new AccountPage(driver);
    }

    public CheckInsPage goToCheckIns(){
        swipeDown();
        swipeDown();
        swipeDown();
        swipeDown();
        click(By.name("Your Check-Ins"));
        return new CheckInsPage(driver);
    }

}