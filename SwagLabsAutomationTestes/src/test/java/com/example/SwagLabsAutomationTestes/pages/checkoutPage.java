package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkoutPage extends core {

    public void finalizarCompra (String nome, String sobrenome, String cep){
        WebElement carrinho = driver.findElement(By.id("shopping_cart_container"));
        carrinho.click();
        WebElement btnCheckout = driver.findElement(By.id("checkout"));
        btnCheckout.click();
        WebElement primeiroNome = driver.findElement(By.id ("first-name"));
        primeiroNome.sendKeys(nome);
        WebElement segundoNome = driver.findElement(By.id("last-name"));
        segundoNome.sendKeys(sobrenome);
        WebElement cepCasa = driver.findElement(By.id("postal-code"));
        cepCasa.sendKeys(cep);
        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();
        WebElement btnFinish = driver.findElement(By.id("finish"));
        btnFinish.click();
    }

}
