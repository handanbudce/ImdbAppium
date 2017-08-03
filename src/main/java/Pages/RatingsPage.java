package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class RatingsPage extends BasePage {

    public RatingsPage(AndroidDriver driver) {
        super(driver);
    }

    public Boolean ratingVisible(){
        return checkVisible(By.id("com.imdb.mobile:id/user_rating"));
    }

}