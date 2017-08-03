package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CheckInsPage extends BasePage {

    public CheckInsPage(AndroidDriver driver) {
        super(driver);
    }

    public String customMessage(){
        return getText(By.id("com.imdb.mobile:id/description"));
    }

}