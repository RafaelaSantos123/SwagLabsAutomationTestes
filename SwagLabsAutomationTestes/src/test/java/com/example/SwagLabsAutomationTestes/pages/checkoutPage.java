package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;

public class checkoutPage extends core {

    public By btnCarrinho  = By.id("shopping_cart_container");
    public By btnCheckout  = By.id("checkout");
    public By btnContinue  = By.id("continue");
    public By btnFinish    = By.id("finish");
    public By inputFirstName = By.id("first-name");
    public By inputLastName = By.id("last-name");
    public By inputPostalCore = By.id("postal-code");

    public void finalizarCompra (String nome, String sobrenome, String cep){
        clicar(btnCarrinho);
        clicar(btnCheckout);
        escrever(inputFirstName, nome);
        escrever(inputLastName, sobrenome);
        escrever(inputPostalCore, cep);
        clicar(btnContinue);
        clicar(btnFinish);
    }

}
