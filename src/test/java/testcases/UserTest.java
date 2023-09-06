package testcases;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.models.User;
import com.qacart.todo.pages.RegisterPage;
import com.qacart.todo.pages.TodoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToRegisterToTheApplication(){

        User user = new User();

        driver.get("https://todo.qacart.com/signup");

        RegisterPage.getInstance().register(driver, user);
        boolean isWelcomeDisplayed = new TodoPage().isWelcomeMessageDisplayed(driver);

        Assert.assertTrue(isWelcomeDisplayed);

    }
}
