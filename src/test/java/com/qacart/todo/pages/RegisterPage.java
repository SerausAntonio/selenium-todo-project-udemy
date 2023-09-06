package com.qacart.todo.pages;

import com.qacart.todo.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
 private static RegisterPage registerPage;
 private final By firstNameInput = By.xpath("//input[@data-testid='first-name']");
 private final By lastNameInput = By.xpath("//input[@data-testid='last-name']");
 private final By emailInput = By.xpath("//input[@data-testid='email']");
 private final By passwordInput = By.xpath("//input[@data-testid='password']");
 private final By confirmpasswordInput = By.xpath("//input[@data-testid='confirm-password']");

 private final By submitButton = By.xpath("//span[@class='MuiButton-label']");

 private RegisterPage(){}
 public static RegisterPage getInstance(){
     if(registerPage == null){
         registerPage = new RegisterPage();
     }
     return registerPage;
 }
 public void register(WebDriver driver, User user) {
     driver.findElement(firstNameInput).sendKeys(user.getFirstName());
     driver.findElement(lastNameInput).sendKeys(user.getLastName());
     driver.findElement(emailInput).sendKeys(user.getEmail());
     driver.findElement(passwordInput).sendKeys(user.getPassword());
     driver.findElement(confirmpasswordInput).sendKeys(user.getPassword());
     driver.findElement(submitButton).click();
 }

}
