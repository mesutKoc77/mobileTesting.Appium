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
        elementHelper.sleep(30);
        driver.findElement(kategorilerbutonu).click();
        //denemedim ama aşağıdaki şekilde de olabilir çünkü java atamaya sagdan sola başlar, biz aşağıda
        //"findElementBy" i sectigimiz için ayrıca by eklememize gerek kalmadı ama yukarıda classs seviyesinde webelement leri
        // oluşturrken mecburen variable in yanina by koymalıyız. cunku bunun value su aşağıdaki gibi otomatik by getirmiyor
        //dolayısyla yukarıda diyoruz kikolaylık olsun diye evet sen de by yok ama ben sana ekliyprum yoksa aşağıda
        //findelementby dedigimde yukarıdaki atamayı bize getirmez ve hata veriri.
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")")).click();

    }


    public void elektronikTiklama() {
        elementHelper.sleep(30);
        List<WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        String yazisi = ListofElement.get(1).getText();
        String beklenenYazisi = "Elektronik";


        Assert.assertEquals(beklenenYazisi, yazisi);
        ListofElement.get(1).click();


    }

    public void telefonVeAksesuarSecimi() {
        elementHelper.sleep(3);
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(com.dmall.mfandroid:id/ivCategoryItem)"));
        ListofElement.get(0).click();


    }

    public void cepTelefonuSecimi() {
        elementHelper.sleep(30);
        List<WebElement> elements =driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\\\"com.dmall.mfandroid:id/ivCategoryItem\\\")"));
        elementHelper.sleep(30);
        elements.get(0).click();

    }

    public void markaSecimi() {
        elementHelper.sleep(30);
        //yuarıya gittik claas level de variable olarak taanımlasdık buraya cektik.
        driver.findElement(apple).click();
       //ya da bunu dene driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\\\"Apple\\\")")).click();


    }

    public void filtrelemeTiklama() {
        elementHelper.sleep(30);
        //elementi bulurken veya bbelirlerken oncelikle emulatır ve ampıum eşitleemsi yapılmalı.
        driver.findElement(filtrele).click();


    }

    public void filtrelemeYap() {
        elementHelper.sleep(30);
        driver.findElement(dahiliHafiza).click();
        elementHelper.sleep(30);
        driver.findElement(gb).click();
        elementHelper.sleep(30);
        driver.findElement(uygula).click();
        elementHelper.sleep(30);
        driver.findElement(model).click();
        elementHelper.sleep(30);
        driver.findElement(iPhone).click();
        elementHelper.sleep(30);
        driver.findElement(uygula).click();
        elementHelper.sleep(30);
        driver.findElement(renk).click();
        elementHelper.sleep(30);
        driver.findElement(mavi).click();
        elementHelper.sleep(30);
        driver.findElement(uygula).click();
        elementHelper.sleep(30);


    }

    public void sonuclariGosterTiklama() {
        elementHelper.sleep(30);
        driver.findElement(sonucGoster).click();




    }

    public void urunSepeteEkleme() {
        elementHelper.sleep(30);
        driver.findElement(artiButonu).click();


    }

    public void sepeteGit() {
        elementHelper.sleep(30);
        driver.findElement(sepetim).click();



    }

    public void sepetKontrol() {
        elementHelper.sleep(30);
        elementHelper.checkVisible(sepetKontrol);


       // wait.until(ExpectedConditions.presenceOfElementLocated(sepetKontrol)).click();

    }
}
