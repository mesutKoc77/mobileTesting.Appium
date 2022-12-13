package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;
public class n11StepDefinitions {
    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());

    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklama();

    }

    @When("TelefonveAksesuarlari Secilir")
    public void telefonveaksesuarlariSecilir() {

    }

    @When("Cep telefonu secilir")
    public void cepTelefonuSecilir() {

    }

    @When("Marka secilir")
    public void markaSecilir() {

    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {

    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {

    }

    @When("Sonuclarigostere tiklanir")
    public void sonuclarigostereTiklanir() {

    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {

    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {

    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {

    }
}