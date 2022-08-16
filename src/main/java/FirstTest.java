import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void check() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By country = By.xpath("//button[@data-qa-value='Україна']");
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        By sum = By.xpath("(//button)[5]");
        By cardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By cardRecieverName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By cardRecieverSurname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By sbmtBtn = By.xpath("//button[@data-qa-node='submit']");

        driver.get("https://next.privat24.ua/mobile");

        driver.findElement(country).sendKeys("Ukraine");
        driver.findElement(phoneNumber).sendKeys("635900684");
        driver.findElement(sum).click();
        driver.findElement(cardFrom).sendKeys("4731142256436666");
        driver.findElement(expDate).sendKeys("1129");
        driver.findElement(cvv).sendKeys("123");
        driver.findElement(cardRecieverName).sendKeys("Petro");
        driver.findElement(cardRecieverSurname).sendKeys("Petrov");
        driver.findElement(sbmtBtn).sendKeys();

    }
}


