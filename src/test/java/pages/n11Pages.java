package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");

    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    public void kategoriTiklama() {
        driver.findElement(kategorilerbutonu).click();
        //denemedim ama aşağıdaki şekilde de olabilir çünkü java atamaya sagdan sola başlar, biz aşağıda
        //"findElementBy" i sectigimiz için ayrıca by eklememize gerek kalmadı ama yukarıda classs seviyesinde webelement leri
        // oluşturrken mecburen variable in yanina by koymalıyız. cunku bunun value su aşağıdaki gibi otomatik by getirmiyor
        //dolayısyla yukarıda diyoruz kikolaylık olsun diye evet sen de by yok ama ben sana ekliyprum yoksa aşağıda
        //findelementby dedigimde yukarıdaki atamayı bize getirmez ve hata veriri.
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")")).click();
    }


    public void elektronikTiklama() {
        List<WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        String yazisi = ListofElement.get(1).getText();
        String beklenenYazisi = "Elektronik";
        System.out.println(yazisi);

        Assert.assertEquals(beklenenYazisi, yazisi);
        ListofElement.get(1).click();


    }

    public void telefonVeAksesuarSecimi() {

    }

    public void cepTelefonuSecimi() {

    }

    public void markaSecimi() {

    }

    public void filtrelemeTiklama() {

    }

    public void filtrelemeYap() {

    }

    public void sonuclariGosterTiklama() {


    }

    public void urunSepeteEkleme() {

    }

    public void sepeteGit() {

    }

    public void sepetKontrol() {

    }
}
