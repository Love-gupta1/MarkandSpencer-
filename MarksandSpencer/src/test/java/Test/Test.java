package Test;

import Test.openqa.selenium.By;
import Test.openqa.selenium.WebDriver;
import Test.openqa.selenium.chrome.ChromeDriver;
public class Test {
    public static void main(String[] args) throws InterruptedException {
        setup();
    }

    static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.marksandspencer.in/?utm_source=google&utm_medium=search&utm_campaign=9897984394&adgroupid=100463569196&utm_content=614575421702&utm_term=marks%20and%20spencer&gclid=EAIaIQobChMIgrC5rub1-QIVGBwrCh1OLgdVEAAYASAAEgL1VPD_BwE&gclsrc=aw.ds");
    }

    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(500);
        driver.quit();
    }


}
