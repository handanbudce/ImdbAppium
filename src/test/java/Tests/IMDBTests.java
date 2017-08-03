package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IMDBTests extends BaseTest{

    String checkInText = "Brilliant! Just brilliant!";

    @Test
    public void addToWatchlist(){
        searchList = myAccount.searchMovie("The Mirror");
        movieDetail = searchList.clickOnFirstResult();
        String movieTitle = movieDetail.addToWatchList();
        movieDetail.goToMyAccount();
        watchList = myAccount.goToWatchlist();
        //E.A: Assertion fails if text won't split because otherwise the space
        //between the title and date are not equal.
        //We might warn IMDb about that :)
        Assert.assertTrue(watchList.getTitle().contains(movieTitle.split(" ")[0]));
    }

    @Test
    public void rateMovie(){
        searchList = myAccount.searchMovie("Lord of the Rings");
        movieDetail = searchList.clickOnFirstResult();
        movieDetail.rateMovie();
        movieDetail.goToMyAccount();
        ratings = myAccount.goToRatings();
        Assert.assertTrue(ratings.ratingVisible());
    }

    @Test
    public void checkIn(){
        searchList = myAccount.searchMovie("Dunkirk");
        movieDetail = searchList.clickOnFirstResult();
        customMessage = movieDetail.checkIn();
        customMessage.enterCustomMessage(checkInText);
        home = movieDetail.goToHomepage();
        checkIns =  home.goToCheckIns();
        Assert.assertTrue(checkIns.customMessage().contains("Brilliant"));
    }

}