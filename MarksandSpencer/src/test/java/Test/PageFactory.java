package Test;
import Test.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private Menu menu;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public Menu getMenu() {
        if (menu == null) {
            menu = new Menu(driver);
        }
        return menu;
    }
}
