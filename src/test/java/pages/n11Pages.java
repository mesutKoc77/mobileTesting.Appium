package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    //n11 de elementleri Liste olarak almak en mantıklısı. daha sonra index ile donusler yapılır.
    By kategorilerbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By apple=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Apple\\\")");
    By filtrele=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/listingFilterRL\\\")");
    By dahiliHafiza=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Dahili Hafıza\\\")");
    By gb=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"128 GB\\\")");
    By uygula=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/applyBtn\\\")");
    By model=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Model\\\")");
    By iPhone=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Iphone 13\\\")");
    By renk=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Renk\\\")");
    By mavi=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Mavi\\\")");
    By sonucGoster=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\\\")");
    By artiButonu =MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/ivAddToBasket\\\")");
    By sepetim=MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Sepetim\\\")");
    By sepetKontrol=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\\\")");


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
        List<WebElement> elements = driver.findElements(MobileBy.AndroidUIAutomator(" new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        elements.get(0).click();


    }

    public void cepTelefonuSecimi() {
        List<WebElement> elements =driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/ivCategoryItem\\\")"));
        elements.get(0).click();

    }

    public void markaSecimi() {
        //yuarıya gittik claas level de variable olarak taanımlasdık buraya cektik.
        driver.findElement(apple).click();
       //ya da bunu dene driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Apple\\\")")).click();


    }

    public void filtrelemeTiklama() {
        //elementi bulurken veya bbelirlerken oncelikle emulatır ve ampıum eşitleemsi yapılmalı.
        driver.findElement(filtrele).click();


    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafiza).click();
        driver.findElement(gb).click();
        driver.findElement(uygula).click();
        driver.findElement(model).click();
        driver.findElement(iPhone).click();
        driver.findElement(uygula).click();
        driver.findElement(renk).click();
        driver.findElement(mavi).click();
        driver.findElement(uygula).click();


    }

    public void sonuclariGosterTiklama() {
        driver.findElement(sonucGoster).click();


    }

    public void urunSepeteEkleme() {
        driver.findElement(artiButonu).click();

    }

    public void sepeteGit() {
        driver.findElement(sepetim).click();


    }

    public void sepetKontrol() {
        elementHelper.checkVisible(sepetKontrol);

       // wait.until(ExpectedConditions.presenceOfElementLocated(sepetKontrol)).click();

    }
}
