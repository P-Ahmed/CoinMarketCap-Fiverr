package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

public class HomePage {
    public static String preName;
    public static String postName;
    @FindBy(xpath = "//span[contains(text(),'Maybe later')]")
    WebElement disableFeedback;
    @FindBy(className = "cmc-cookie-policy-banner__close")
    WebElement closingCookieWindow;
    @FindBy(xpath = "//button[@data-btnname='Log In']")
    WebElement loginButton;
    @FindBy(xpath = "//div")
    List<WebElement> clickingRowFilter;
    @FindBy(xpath = "//button[contains(text(),'20')]")
    WebElement filterBy20;
    @FindBy(xpath = "//p")
    List<WebElement> nameLbl;
    @FindBy(xpath = "//span")
    List<WebElement> priceLbl;
    @FindBy(xpath = "//span[@class='icon-Slider']")
    List<WebElement> filterButton;
    @FindBy(xpath = "//button[contains(text(),'Algorithm')]")
    WebElement algorithmButton;
    @FindBy(xpath = "//li[contains(text(),'PoW')]")
    List<WebElement> clickPowAlgorithm;
    @FindBy(xpath = "//button[contains(text(),'+')]")
    WebElement addFilterButton;
    @FindBy(xpath = "//div[@class='popup-content ']")
    WebElement popupContent;
    @FindBy(xpath = "//label[@id='mineable']")
    WebElement mineableToggle;
    @FindBy(xpath = "//button[contains(text(),'All Cryptocurrencies')]")
    WebElement allCryptocurrencyButton;
    @FindBy(xpath = "//button[contains(text(),'Coins')]")
    WebElement coinsButton;
    @FindBy(xpath = "//button[contains(text(),'Price')]")
    WebElement priceButton;
    @FindBy(xpath = "//input[@data-qa-id='range-filter-input-min']")
    WebElement minPriceTxt;
    @FindBy(xpath = "//input[@data-qa-id='range-filter-input-max']")
    WebElement maxPriceTxt;
    @FindBy(xpath = "//button[@data-qa-id='filter-dd-button-apply']")
    WebElement filterApplyButton;
    @FindBy(xpath = "//button[contains(text(),'Show results')]")
    WebElement showResultButton;
    @FindBy(xpath = "//p[contains(text(),'Name')]")
    WebElement name;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void filterToShowTwentyData() throws InterruptedException {
        Thread.sleep(3000);
        disableFeedback.click();
        closingCookieWindow.click();
        clickingRowFilter.get(216).click();
        filterBy20.click();
    }

    public void capturePreFilterData() throws ParseException {
        preName = nameLbl.get(37).getText();
    }

    public void clicksOnFilter() {
        loginButton.sendKeys(Keys.DOWN);
        filterButton.get(1).click();
    }

    public void filterByAlgorithm() {
        algorithmButton.click();
        clickPowAlgorithm.get(1).click();
    }

    public void clicksOnAddFilter() throws InterruptedException {
        addFilterButton.click();
        Thread.sleep(5000);
    }

    public void toggleOnMineable() {
        popupContent.click();
        mineableToggle.click();
    }

    public void selectingCryptoCurrencyAndCoins() throws InterruptedException {
        Thread.sleep(3000);
        allCryptocurrencyButton.click();
        Thread.sleep(2000);
        coinsButton.click();
    }

    public void inputtingPriceRange(String min, String max) {
        priceButton.click();
        minPriceTxt.sendKeys(min);
        maxPriceTxt.sendKeys(max);
    }

    public void applyingFilter() throws InterruptedException {
        filterApplyButton.click();
        showResultButton.click();
        Thread.sleep(5000);
    }

    public void verifyName() {
        postName = nameLbl.get(37).getText();
        System.out.println(preName);
        System.out.println(postName);
        Assert.assertNotEquals(preName, postName);
    }
}
