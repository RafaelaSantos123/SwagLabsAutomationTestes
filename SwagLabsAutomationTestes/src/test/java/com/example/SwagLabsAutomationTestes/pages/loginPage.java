package com.example.SwagLabsAutomationTestes.pages;


import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class loginPage extends core {

    public By btnlogin  = By.id("login-button");

    public void realizarLogin() throws InterruptedException {


        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.id("login-button"));
        button.click();
        clicar(btnlogin);


    }

}
