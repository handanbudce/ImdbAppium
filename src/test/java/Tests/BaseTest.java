package Tests;

import Pages.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private AndroidDriver driver;

    protected AccountPage myAccount;
    protected LoginPage login;
    protected HomePage home;
    protected SearchList searchList;
    protected MovieDetail movieDetail;
    protected WatchListPage watchList;
    protected RatingsPage ratings;
    protected CustomMessagePage customMessage;
    protected CheckInsPage checkIns;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.android();

        // Please replace the below 'APK Path' with the path on your pc.
        caps.setCapability(MobileCapabilityType.APP, "C:/Apks/com.imdb.mobile-7.1.1.107110100-APK4Fun.com.apk");

        // Please replace the device name with your own device name.
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"DEWKC6MJ6T6TKBOR");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);

        login = new LoginPage(driver);
        
        myAccount = login.signInWithIMDB();

    }

}