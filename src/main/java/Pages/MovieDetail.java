package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MovieDetail extends BasePage {

    public MovieDetail(AndroidDriver driver) {
        super(driver);
    }

    public String addToWatchList(){

        //E.A: Without a swipe, it is almost impossible to click 'Add To Watchlist'
        swipeDown();

        //E.A: Click on 'Add To Watchlist'
        click(By.id("com.imdb.mobile:id/state_off"));

        //E.A: Get title. It is for assertion.
        String title = getText(By.id("com.imdb.mobile:id/title"));

        return title;
    }

    public CustomMessagePage checkIn(){
        click(By.id("com.imdb.mobile:id/overflow"));
        click(By.name("Check In"));
        return new CustomMessagePage(driver);
    }

    public HomePage goToHomepage(){
        click(By.className("android.widget.ImageButton"));
        return new HomePage(driver);
    }

    public void goToMyAccount(){
        click(By.id("com.imdb.mobile:id/menu_account"));
    }

    public void rateMovie(){
        click(By.id("com.imdb.mobile:id/star_your"));
        click(By.id("com.imdb.mobile:id/stars"));
        click(By.id("com.imdb.mobile:id/save_button"));
    }

}