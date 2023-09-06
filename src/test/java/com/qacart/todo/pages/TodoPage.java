package com.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage {

    private final By welcomeMessage = By.xpath("//*[@data-testid='todo-text']");
    private final By plusButton =  By.xpath("//*[@data-testid='add']");
    private final By todoItem =  By.xpath("//*[@data-testid='todo-text']");
    private final By deleteIcon = By.xpath("//*[@data-testid='delete']");
    private final By noTodosMessage = By.xpath("//*[@data-testid='no-todos']");

    public boolean isWelcomeMessageDisplayed(WebDriver driver){
      return driver.findElement(welcomeMessage).isDisplayed();
    }

    public void clickOnPlusButton(WebDriver driver){
        driver.findElement(plusButton).click();
    }

    public String getTodoText(WebDriver driver){
        return driver.findElement(todoItem).getText();
    }

    public void deleteTodo(WebDriver driver){

        driver.findElement(deleteIcon).click();
    }
    public boolean isNoTodoMessageDisplayed(WebDriver driver){
        return driver.findElement(noTodosMessage).isDisplayed();
    }
}
