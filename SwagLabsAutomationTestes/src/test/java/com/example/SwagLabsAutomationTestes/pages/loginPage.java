package com.example.SwagLabsAutomationTestes.pages;


import com.example.SwagLabsAutomationTestes.core.core;
import org.openqa.selenium.By;



public class loginPage extends core {

    public By btnlogin  = By.id("login-button");

    public By userName  = By.id("user-name");

    public By passWord  = By.id("password");



    public void realizarLogin() throws InterruptedException {

        escrever(userName,"standard_user");
        escrever(passWord,"secret_sauce");
        clicar(btnlogin);


    }

}
