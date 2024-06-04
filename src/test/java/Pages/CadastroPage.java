package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroPage {
    WebDriver driver;
    WebDriverWait wait;
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void cadastrar() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='proponent_name']")).click();
        driver.findElement(By.xpath("//input[@name='proponent_name']")).sendKeys("Teste novo");
        driver.findElement(By.xpath("//input[@name='proponent_email']")).click();
        driver.findElement(By.xpath("//input[@name='proponent_email']")).sendKeys("novo@teste.com");
        driver.findElement(By.xpath("//input[@name='proponent_phone']")).click();
        driver.findElement(By.xpath("//input[@name='proponent_phone']")).sendKeys("11966885522");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-testid='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/main[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//li[@id='option-ds-field-property_type_0']")).click();
        driver.findElement(By.xpath("//input[@name='property_value']")).click();
        driver.findElement(By.xpath("//input[@name='property_value']")).sendKeys("300000");
        driver.findElement(By.xpath("//input[@name='input_value']")).click();
        driver.findElement(By.xpath("//input[@name='input_value']")).sendKeys("100000");
        driver.findElement(By.xpath("//input[@name='birthdate']")).click();
        driver.findElement(By.xpath("//input[@name='birthdate']")).sendKeys("10101980");
        driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/main[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[8]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//li[@id='option-ds-field-has_property_1']")).click();
        driver.findElement(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/main[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[9]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//li[@id='option-ds-field-time_acquire_property_2']")).click();
        driver.findElement(By.xpath("//input[@id='insurer_itau']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'simular')]")).click();

    }
}
