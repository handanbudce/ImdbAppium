package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchList extends BasePage {

    public SearchList(AndroidDriver driver) {
        super(driver);
    }

    public MovieDetail clickOnFirstResult(){
        click(By.id("com.imdb.mobile:id/label"));
        return new MovieDetail(driver);
    }

}