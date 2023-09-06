package testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.models.User;
import com.qacart.todo.pages.NewToDoPage;
import com.qacart.todo.pages.RegisterPage;
import com.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ToDoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddATodo(){
        User user = new User();
        driver.get("https://todo.qacart.com/signup");
        RegisterPage.getInstance().register(driver, user);
        new TodoPage().clickOnPlusButton(driver);
        new NewToDoPage().addTodo(driver, "Learn Selenium");

        String actualMessage = new TodoPage().getTodoText(driver);
        String expectedMessage = "Learn Selenium";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void shouldBeAbleTodeleteATodo(){

        User user = new User();

        driver.get("https://todo.qacart.com/signup");
        RegisterPage.getInstance().register(driver, user);
        new TodoPage().clickOnPlusButton(driver);
        new NewToDoPage().addTodo(driver, "Learn Selenium");
        new TodoPage().deleteTodo(driver);

        boolean isNoTodosDisplayes = new TodoPage().isNoTodoMessageDisplayed(driver);
        Assert.assertTrue(isNoTodosDisplayes);
    }

}
