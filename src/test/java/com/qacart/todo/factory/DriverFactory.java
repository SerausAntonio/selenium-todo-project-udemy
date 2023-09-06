package com.qacart.todo.factory;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver initializeDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;

         /*  switch (browser){
            case "CHROME" -> {
                WebDriver driver = new ChromeDriver();
            }
            case "FIREFOX" -> {
                WebDriver driver = new FirefoxDriver();
            }
            case "EDGE" -> {
                WebDriver driver = new EdgeDriver();
            }

        }
       */

    }
}
