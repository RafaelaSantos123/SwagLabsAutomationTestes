package com.example.SwagLabsAutomationTestes.testes;

import com.example.SwagLabsAutomationTestes.core.core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class acessarCarrinhoTestes extends core {
    @BeforeEach
    void openBrowser(){

        abrirChrome("https://www.saucedemo.com");
    }
    @Test
    void realizarCompraCarrinho () throws InterruptedException{
        loginPage.realizarLogin();
        homePage.realizarOrdenacaoPrecos();
        compraPage.realizarCompra();
        acessarCarrinhoPage.acessoCarrinho();

    }

    @AfterEach
    void quitBrowser(){
        driver.quit();
    }
}
