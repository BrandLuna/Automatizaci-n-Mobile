package java.com.mobile;


import org.openqa.selenium.OutputType;

public class Util {

    public static void takeScreenShoot(){
        byte[] screenshot = MobileDriverManager.getDriver().getScreenshotAs(OutputType.BYTES);
        ManageScenario.getScenario().attach(screenshot, "image/jpeg", "evidencia");
    }

}
