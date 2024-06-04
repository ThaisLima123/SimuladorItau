package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class IniciarPage {
    WebDriver driver;
    public IniciarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCpf() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Digite seu CPF']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Digite seu CPF']")).sendKeys("81143365011");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Digite seu CPF']")).submit();
    }
}
