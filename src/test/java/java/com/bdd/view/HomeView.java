package java.com.bdd.view;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.com.mobile.MobileBase;
import java.com.mobile.MobileDriverManager;

public class HomeView extends MobileBase {

    @AndroidFindBy(id = "com.linio.android:id/im_cat")
    private MobileElement searchButton;

    @AndroidFindBy(id = "com.linio.android:id/llSearchBarContainer")
    private MobileElement secondsearchButton;

    @AndroidFindBy(id = "com.linio.android:id/llSearchBar")
    private MobileElement searchInput;

    public void goSearch() {
        searchButton.click();
    }

    public void secondgoSearch() {secondsearchButton.click();}

    public void typeVideo(String video) {
        searchInput.sendKeys(video);
    }

    public void enterKeyBoard() {
        ((AndroidDriver) MobileDriverManager.getDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public void secondenterKeyBoard() {
        ((AndroidDriver) MobileDriverManager.getDriver()).pressKey(new KeyEvent(AndroidKey.ENTER));
    }


}
