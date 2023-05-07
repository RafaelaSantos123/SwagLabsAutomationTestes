package com.example.SwagLabsAutomationTestes.testes;

import com.example.SwagLabsAutomationTestes.core.core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class checkoutTeste extends core {
    @BeforeEach
    void openBrowser(){
        abrirChrome();
    }
    @Test
    void realizarCompra() throws InterruptedException  {
        loginPage.realizarLogin();
        homePage.realizarOrdenacaoPrecos();
        compraPage.realizarCompra();
        checkoutPage.finalizarCompra("Isadora", "Alves", "38413219");
        verificarTituloFinalizacaoCompra();

    }


     public void verificarTituloFinalizacaoCompra() {
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "Swag Labs";
        //Verificação Passando texto como parametro
        Assert.hasText(ActualTitle, "Swag Labs");

        //Verificação Passando variavel como parametro
        Assertions.assertEquals(ExpectedTitle, ActualTitle);

    }
    @AfterEach
    void quitBrowser(){
        driver.quit();

    }

}
