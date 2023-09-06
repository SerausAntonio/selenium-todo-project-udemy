package com.qacart.todo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewToDoPage {

    private final By newTodoInput = By.xpath("//*[@data-testid='new-todo']");
    private final By newTodoSubmit = By.xpath("//*[@data-testid='submit-newTask']");

    public void addTodo(WebDriver driver, String item){
        driver.findElement(newTodoInput).sendKeys(item);
        driver.findElement(newTodoSubmit).click();
    }
}
