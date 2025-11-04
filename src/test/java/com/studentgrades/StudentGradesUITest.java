package com.studentgrades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class StudentGradesUITest {

    @Test
    public void openStudentGradesPage() throws InterruptedException {
        // Automatically sets up ChromeDriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Open your deployed site or local file
        driver.get("https://stugrades.netlify.app/");
        driver.findElement(By.id("name")).sendKeys("bhargavi");
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.id("maths")).sendKeys("100");
        driver.findElement(By.id("phy")).sendKeys("99");
        driver.findElement(By.id("che")).sendKeys("22");
        driver.findElement(By.xpath("//*[@id=\"res\"]")).click();
        driver.close();

    


        // driver.manage().window().maximize();

        // Keep the browser open until you close it manually
        // System.out.println("Browser opened. Press Ctrl+C to stop or close the browser manually.");
        // Thread.sleep(9999999); // waits indefinitely until closed manually

        // // driver.quit(); // optional
    }
}
