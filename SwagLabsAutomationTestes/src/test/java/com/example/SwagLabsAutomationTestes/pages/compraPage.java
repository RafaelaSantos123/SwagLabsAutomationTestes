package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;

public class compraPage extends core {


    public By produtoUm = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public By produtoDois = By.id("add-to-cart-sauce-labs-backpack");

    public By produtoTres = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");


    public void realizarCompra() throws InterruptedException {

        clicar(produtoUm);
        clicar(produtoDois);
        clicar(produtoTres);

    }

}
