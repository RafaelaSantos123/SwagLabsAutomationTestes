package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;

public class compraPage extends core {


    public By produtoUm = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public By produtoDois = By.id("add-to-cart-sauce-labs-backpack");

    public By produtoTres = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    public By produtoQuatro = By.id("add-to-cart-sauce-labs-bike-light");

    public By produtoCinco = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public By produtoSeis = By.id("add-to-cart-sauce-labs-onesie");

    public By btnCheckout  = By.id("checkout");

    public By btnCarrinho  = By.id("shopping_cart_container");

    public void realizarCompra() throws InterruptedException {

        clicar(produtoUm);
        clicar(produtoDois);
        clicar(produtoTres);
        clicar(produtoQuatro);
        clicar(produtoCinco);
        clicar(produtoSeis);
        clicar(btnCarrinho);
        scroll(btnCheckout);
    }

}
