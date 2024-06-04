package Pages;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class AcessoPage {

    WebDriver driver;
    public AcessoPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarSimulador(){
        driver.manage().window().maximize();
        driver.get("https://credito-imobiliario.itau.com.br/");
    }
}
