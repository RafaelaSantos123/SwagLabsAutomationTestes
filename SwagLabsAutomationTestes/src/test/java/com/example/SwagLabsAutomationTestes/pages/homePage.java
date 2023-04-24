package com.example.SwagLabsAutomationTestes.pages;


import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends core {

    public By realizarClickParaSelecionar = By.id("//*[@id=\"header_container\"]/div[2]/div/span");

    public By selectProdutc  = By.id("//*[@id=\"header_container\"]/div[2]/div/span/select");

    public By selectOrdenacaoMaiorPreco = By.id("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]");

    public void realizarOrdenacaoPrecos () throws InterruptedException {

        clicar(realizarClickParaSelecionar);
        clicar(selectProdutc);
        clicar(selectOrdenacaoMaiorPreco);

//        WebElement realizarClickParaSelecionar = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span"));
//        realizarClickParaSelecionar.click();
//
//        WebElement selectProdutc = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
//        selectProdutc.click();
//
//        WebElement selectOrdenacaoMaiorPreco = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]"));
//        selectOrdenacaoMaiorPreco.click();

    }

}

