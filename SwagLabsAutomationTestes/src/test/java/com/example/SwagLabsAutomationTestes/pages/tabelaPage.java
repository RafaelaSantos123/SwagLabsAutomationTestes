package com.example.SwagLabsAutomationTestes.pages;

import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tabelaPage extends core {

    public By btnAdd = By.id("addNewRecordButton");

    public By campoFirstName = By.id("firstName");

    public By campoLastName = By.id("lastName");

    public By campoUserEmail = By.id("userEmail");

    public By campoAge = By.id("age");

    public By campoSalary = By.id("salary");

    public By campoDepartment = By.id("department");

    public By btnSalvar = By.id("submit");

    public By btnExcluir = By.id("delete-record-4");

    public By buscarNomeGrid = By.xpath("//font[text()='Bruna']");

    public void adicionarRegistro() throws InterruptedException {

        clicar(btnAdd);
        escrever(campoFirstName,"Bruna");
        escrever(campoLastName,"Santos");
        escrever(campoUserEmail,"bruna.teste@gmail.com");
        escrever(campoAge,"26");
        escrever(campoSalary,"1000");
        escrever(campoDepartment,"QA");
        clicar(btnSalvar);

    }

    public void excluirRegistro() throws InterruptedException{
        clicar(btnExcluir);
    }

    public void verificarExclusao(By elemento) throws InterruptedException{
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elemento));
    }

}


