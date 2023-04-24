package com.example.SwagLabsAutomationTestes.testes;

import com.example.SwagLabsAutomationTestes.core.core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class homeTestes extends core {

    @BeforeEach
    void openBrowser(){
        abrirChrome();
    }
    @Test
    void validarLogin() throws InterruptedException {

        loginPage.realizarLogin();
        homePage.realizarOrdenacaoPrecos();

    }

    @AfterEach
    void quitBrowser(){
        driver.quit();
    }
}

