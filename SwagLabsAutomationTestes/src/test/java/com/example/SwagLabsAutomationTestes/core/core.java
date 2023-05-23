package com.example.SwagLabsAutomationTestes.core;


import com.example.SwagLabsAutomationTestes.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


// ESSA PASTA CORE É COMO SE FOSSE A PASTA MAIN DO PROJETO
public class core {


    public static WebDriver driver;

  public static loginPage loginPage = new loginPage();
  public static homePage homePage = new homePage();
  public static compraPage compraPage = new compraPage();
  public static acessarCarrinhoPage acessarCarrinhoPage = new acessarCarrinhoPage();
  public static checkoutPage checkoutPage = new checkoutPage();
  public static tabelaPage tabelaPage = new tabelaPage();

    public static void abrirChrome(String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        esperaImplicita();
        driver.get(url);


    }

   public static void esperaImplicita(){

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   }

   public static void esperaExplicita(By locator){
       WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(locator));

   }

   public static void clicar( By locator){
        esperaExplicita(locator);
        WebElement element = driver.findElement(locator);
        element.click();

   }

   public static  void escrever (By locator, String text){
        esperaExplicita(locator);
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
   }
   public static void scroll (By locator) throws InterruptedException {
       WebElement iframe = driver.findElement(locator);
       new Actions(driver)
               .scrollToElement(iframe)
               .perform();
   }
}

