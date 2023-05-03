package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;

public class acessarCarrinhoPage extends core {

    public By btnCarrinho  = By.id("shopping_cart_container");
    public void acessoCarrinho() throws InterruptedException {
        clicar(btnCarrinho);
    }

}