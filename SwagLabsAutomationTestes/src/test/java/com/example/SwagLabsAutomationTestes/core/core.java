package com.example.SwagLabsAutomationTestes.core;


import com.example.SwagLabsAutomationTestes.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

    public static void abrirChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        esperaImplicita();
        driver.get("https://www.saucedemo.com/");


    }

   public static void esperaImplicita(){

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   }
   public static void clicar( By locator){
       WebElement element = driver.findElement(locator);
       element.click();

   }

}

