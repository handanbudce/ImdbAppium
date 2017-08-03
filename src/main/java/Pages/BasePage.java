package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;
    protected TouchAction action;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public Boolean checkVisible(By by){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by)).size() > 0;
    }

    public List<WebElement> findElements(By by){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public String getText(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
    }

    public void sendKeys(By by, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);
    }

    public void swipeDown(){
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.5);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
        driver.swipe(0,scrollStart, 0, scrollEnd, 2000);
    }

}