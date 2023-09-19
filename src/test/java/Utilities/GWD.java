package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver==null) { // ilk kez 1 defa çalışssın
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        }

        return driver;
    }


    public static void quitDriver() {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver kapat
        if (driver!=null) { //driver var ise
           driver.quit();
           driver=null;
        }
    }


}
