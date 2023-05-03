package com.example.SwagLabsAutomationTestes.pages;


import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;


public class homePage extends core {

    public By realizarClickParaSelecionar = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span");

    public By selectProdutc  = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");

    public By selectOrdenacaoMaiorPreco = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]");

    public void realizarOrdenacaoPrecos () throws InterruptedException {

        clicar(realizarClickParaSelecionar);
        clicar(selectProdutc);
        clicar(selectOrdenacaoMaiorPreco);

    }

}

