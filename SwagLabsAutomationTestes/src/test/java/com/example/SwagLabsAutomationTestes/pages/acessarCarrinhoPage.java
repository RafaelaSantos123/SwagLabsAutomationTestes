package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class acessarCarrinhoPage extends core {

    public void acessoCarrinho() throws InterruptedException {
        WebElement btnCarrinho = driver.findElement(By.id("shopping_cart_container"));
        btnCarrinho.click();
        Thread.sleep(5000);
    }

}