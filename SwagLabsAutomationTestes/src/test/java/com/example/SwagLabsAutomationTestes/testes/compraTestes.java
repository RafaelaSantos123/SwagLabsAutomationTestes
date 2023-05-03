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
        compraPage.realizarCompra();
        checkoutPage.finalizarCompra("Isadora", "Alves", "38413219");

    }
    @AfterEach
    void quitBrowser(){
        driver.quit();

    }

}
