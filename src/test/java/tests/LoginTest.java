package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class LoginTest {

    @Test

    public void testLogin(){
 System.setProperty("webdriver.chrome.driver" , "C:\\Users\\camila.santos.YAMAN\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.bbc.com/portuguese");
        navegador.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
        navegador.findElement(By.id("idcta-username")).click();
        navegador.findElement(By.id("user-identifier-input")).sendKeys("camila.santos@gmail.com");
        navegador.findElement(By.id("password-input")).sendKeys("senha1");
        navegador.findElement(By.id("submit-button")).click();
        WebElement logint = navegador.findElement(By.className("form-message__text"));
        String textologin = logint.getText();
        assertEquals("Sorry, that password is too short. It needs to be eight characters or more.", textologin);
    }
}
