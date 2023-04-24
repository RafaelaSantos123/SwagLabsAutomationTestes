package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        //WebElement carrinho = driver.findElement(By.id("shopping_cart_container"));
        //carrinho.click();
        //WebElement btnCheckout = driver.findElement(By.id("checkout"));
        //btnCheckout.click();
        clicar(btnCheckout);
        //WebElement primeiroNome = driver.findElement(By.id ("first-name"));
        escrever(inputFirstName, nome);
//        WebElement segundoNome = driver.findElement(By.id("last-name"));
//        segundoNome.sendKeys(sobrenome);
        escrever(inputLastName, sobrenome);
//        WebElement cepCasa = driver.findElement(By.id("postal-code"));
//        cepCasa.sendKeys(cep);
        escrever(inputPostalCore, cep);
        clicar(btnContinue);
        //WebElement btnContinue = driver.findElement(By.id("continue"));
        //btnContinue.click();
        clicar(btnFinish);
        //WebElement btnFinish = driver.findElement(By.id("finish"));
        //btnFinish.click();


    }

}
