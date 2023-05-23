package com.example.SwagLabsAutomationTestes.testes;

import com.example.SwagLabsAutomationTestes.core.core;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class tabelaTeste  extends core{
        @BeforeEach
        void openBrowser(){
            abrirChrome("https://demoqa.com/webtables");
        }
        @Test
        void gerenciarTabela() throws InterruptedException {
        tabelaPage.adicionarRegistro();
        tabelaPage.excluirRegistro();
        tabelaPage.verificarExclusao(tabelaPage.buscarNomeGrid);


        }
        @AfterEach
        void quitBrowser(){
            driver.quit();

        }
    }




