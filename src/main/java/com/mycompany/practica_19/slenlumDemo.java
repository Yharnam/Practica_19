/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author tutu5
 */
public class slenlumDemo {
    
    
    public static void main (String[] args){
        tesTitle();
        testLogin();
        testSuma();
        testResta();
        testMultiplicar();
        testDivision();
    }
    
    public static void tesTitle(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://demo.guru99.com/test/newtours/";      
        String expectedResult = "Welcome: Merccury Tours";
        String result = "";
        
        driver.get(url);
        
        result = driver.getTitle();
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
        
    }
    public static void testLogin(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://demo.guru99.com/test/newtours/";      
        String expectedResult = "Login Successfully";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("Windows.scrollBy(0,300)","");
        driver.findElement(By.name("userName")).sendKeys("ejemplo");
        driver.findElement(By.name("password")).sendKeys("ejemplo");
        driver.findElement(By.name("submit")).click();
        
        result = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
        
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
    }
    public static void testSuma(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.htm";      
        String expectedResult = "49";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scroll(0,1200)","");
        
        driver.findElement(By.name("number1")).sendKeys("25");
        driver.findElement(By.name("number2")).sendKeys("24");
        
        WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("0");
        
        driver.findElement(By.id("calculateButton")).click();
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
    }
    
    public static void testResta(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.htm";      
        String expectedResult = "35";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scroll(0,1200)","");
        
        driver.findElement(By.name("number1")).sendKeys("100");
        driver.findElement(By.name("number2")).sendKeys("65");
        
        WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("1");
        
        driver.findElement(By.id("calculateButton")).click();
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
    }
    
    public static void testMultiplicar(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.htm";      
        String expectedResult = "81";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scroll(0,1200)","");
        
        driver.findElement(By.name("number1")).sendKeys("9");
        driver.findElement(By.name("number2")).sendKeys("9");
        
        WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("2");
        
        driver.findElement(By.id("calculateButton")).click();
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
    }
    
    public static void testDivision(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tutu5\\Desktop\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        String url = "https://testsheepnz.github.io/BasicCalculator.htm";      
        String expectedResult = "7";
        String result = "";
        
        driver.get(url);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scroll(0,1200)","");
        
        driver.findElement(By.name("number1")).sendKeys("35");
        driver.findElement(By.name("number2")).sendKeys("5");
        
        WebElement element = (WebElement)driver.findElement(By.name("selectOperation"));
        Select select = new Select(element);
        select.selectByValue("3");
        
        driver.findElement(By.id("calculateButton")).click();
        result = driver.findElement(By.name("numberAnswer")).getAttribute("value");
        
        
        if (result.equals(expectedResult)) {
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Fallido");
        }
        driver.close();
    }
    
}
