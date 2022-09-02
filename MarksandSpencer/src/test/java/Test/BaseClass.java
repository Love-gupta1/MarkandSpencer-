package Test;
import Test.openqa.selenium.WebDriver;
import Test.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

    public static void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.marksandspencer.in/?utm_source=google&utm_medium=search&utm_campaign=9897984394&adgroupid=100463569196&utm_content=614575421702&utm_term=marks%20and%20spencer&gclid=EAIaIQobChMIgrC5rub1-QIVGBwrCh1OLgdVEAAYASAAEgL1VPD_BwE&gclsrc=aw.ds");
        pageFactory = new PageFactory(driver);
    }

    public void close() {
        driver.close();

    }
}
