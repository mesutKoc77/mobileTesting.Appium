package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,(10));
        this.action = new Actions(driver);
    }
    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
        //ilgili "key" elementi gorunene kadar bekle ve onu bir WebElement e ata.
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
        //"presenceElement(key)" methodu bana zaten bir WebElement donduruyor ve hatta bekliyor
        //yani şöyle de yazılabilirdi yukarısı
        //WebElement x=wait.until(ExpectedConditions.presenceOfElementLocated(key));
        //hem bekliyor hem de bunu bir webelement e atiyor
    }
    public void click(By key){
        findElement(key).click();  // click --- tıklamayı sağlar.
        //burada da direk "x" webElement'ine tikla diyerek de ifade edebilirdik.
    }

    public void sendKeys(By key , String text){
        findElement(key).sendKeys(text);   //sendKeys --- Text gondermeyi sağlar.
    }
    public void checkVisible(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));

    }


}
