package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public AccountPage goToMyAccount(){
        click(By.id("com.imdb.mobile:id/menu_account"));
        return new AccountPage(driver);
    }

    public CheckInsPage goToCheckIns(){

        while (!checkCheckIns()){
            swipeDown();
        }
        click(By.name("Your Check-Ins"));
        return new CheckInsPage(driver);
    }

    private Boolean checkCheckIns(){
        try{
            waitReduced.until(ExpectedConditions.visibilityOfElementLocated(By.name("Your Check-Ins")));
            return true;
        }catch (Exception e){
            return false;
        }
    }


}