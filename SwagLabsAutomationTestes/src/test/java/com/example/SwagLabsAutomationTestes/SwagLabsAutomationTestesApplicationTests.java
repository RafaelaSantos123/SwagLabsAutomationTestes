package com.example.SwagLabsAutomationTestes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwagLabsAutomationTestesApplicationTests {
	WebDriver driver;
	@Test
	void contextLoads() {
		System.out.println("Isadora");
		System.out.println("Rafaela");

	}
	@Test
	void acessarSite(){

		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

}
