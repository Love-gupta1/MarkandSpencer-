package Test;
import Test.openqa.selenium.By;
import Test.openqa.selenium.WebDriver;
public class Menu {
    WebDriver driver;
    By Women= new By.ByLinkText("Women");
    public Menu(WebDriver driver){
        this.driver=driver;
    }
    public void menu(){
        driver.findElement(Women).click();
    }
}

}
