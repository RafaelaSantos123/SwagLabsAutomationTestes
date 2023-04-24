package com.example.SwagLabsAutomationTestes.testes;


import com.example.SwagLabsAutomationTestes.core.core;
import com.example.SwagLabsAutomationTestes.pages.loginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class loginTestes extends core {

    //public static loginPage loginPage = new loginPage();



    @BeforeEach
    void openBrowser(){
        abrirChrome();


    }

    @Test
    void validarLogin() throws InterruptedException {



        loginPage.realizarLogin();
        // homePage.realizarOrdenacaoMenoresPrecos();


    }
    @AfterEach
    void quitBrowser(){

        driver.quit();
        //driver.close();
    }
}

