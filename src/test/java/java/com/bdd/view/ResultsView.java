package java.com.bdd.view;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.com.mobile.MobileBase;
import java.com.mobile.MobileDriverManager;
import java.com.mobile.Util;
import java.util.List;

public class ResultsView extends MobileBase {

    @AndroidFindBy(id = "com.linio.android:id/tvProductName")
    private List<MobileElement> resulList;

    public int getSizeResult() {
        WebDriverWait webDriverWait = new WebDriverWait(MobileDriverManager.getDriver(), 15);
        webDriverWait.until(ExpectedConditions.visibilityOf(resulList.get(0)));
        Util.takeScreenShoot();
        return resulList.size();
    }

}
