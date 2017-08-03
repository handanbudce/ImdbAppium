package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CustomMessagePage extends BasePage {

    public CustomMessagePage(AndroidDriver driver) {
        super(driver);
    }

    public void enterCustomMessage(String message){
        sendKeys(By.id("com.imdb.mobile:id/message"),message);

        //E.A: Share unchecked for avoiding sharing.
        click(By.id("com.imdb.mobile:id/share_checkin"));

        click(By.id("com.imdb.mobile:id/button"));

    }



}