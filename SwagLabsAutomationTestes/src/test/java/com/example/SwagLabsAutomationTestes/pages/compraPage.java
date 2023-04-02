package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class compraPage extends core {

    public void realizarCompra() throws InterruptedException {

        adicinarItemNoCarrinho("add-to-cart-sauce-labs-fleece-jacket");
        Thread.sleep(1000);
        adicinarItemNoCarrinho("add-to-cart-sauce-labs-backpack");
        Thread.sleep(1000);
        adicinarItemNoCarrinho("add-to-cart-test.allthethings()-t-shirt-(red)");
        Thread.sleep(1000);

    }

    private void adicinarItemNoCarrinho(String btnId) {
        WebElement btnAddCarrinho = driver.findElement(By.id(btnId));
        btnAddCarrinho.click();
    }
}
