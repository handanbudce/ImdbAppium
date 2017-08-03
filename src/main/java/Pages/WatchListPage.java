package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class WatchListPage extends BasePage {

    public WatchListPage(AndroidDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return getText(By.id("com.imdb.mobile:id/label"));
    }

}