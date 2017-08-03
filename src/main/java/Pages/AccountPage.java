package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {

    public AccountPage(AndroidDriver driver) {
        super(driver);
    }

    public SearchList searchMovie(String movieName){
        click(By.id("com.imdb.mobile:id/search"));
        sendKeys(By.id("com.imdb.mobile:id/search_src_text"),movieName);
        return new SearchList(driver);
    }

    public WatchListPage goToWatchlist(){
        click(By.name("Watchlist"));
        return new WatchListPage(driver);
    }

    public RatingsPage goToRatings(){
        click(By.id("com.imdb.mobile:id/ratings_card"));
        return new RatingsPage(driver);
    }

}