package com.example.SwagLabsAutomationTestes.pages;


import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends core {

    public void realizarOrdenacaoPrecos () throws InterruptedException {

        WebElement realizarClickParaSelecionar = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span"));
        realizarClickParaSelecionar.click();

        WebElement selectProdutc = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        selectProdutc.click();

        WebElement selectOrdenacaoMaiorPreco = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
        selectOrdenacaoMaiorPreco.click();

    }

}

