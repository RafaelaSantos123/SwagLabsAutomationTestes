package com.example.SwagLabsAutomationTestes.core;


import com.example.SwagLabsAutomationTestes.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


// ESSA PASTA CORE É COMO SE FOSSE A PASTA MAIN DO PROJETO
public class core {


    public static WebDriver driver;

  public static loginPage loginPage = new loginPage();
    public static void abrirChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


    }




}

