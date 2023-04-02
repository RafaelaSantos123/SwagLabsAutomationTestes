package com.example.SwagLabsAutomationTestes.testes;

import com.example.SwagLabsAutomationTestes.core.core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class compraTestes extends core {
    @BeforeEach
    void openBrowser(){
        abrirChrome();
    }
    @Test
    void realizarCompra() throws InterruptedException  {
        loginPage.realizarLogin();
        homePage.realizarOrdenacaoPrecos();
        compraPage.realizarCompra();

    }
    @AfterEach
    void quitBrowser(){
        driver.quit();

    }

}
