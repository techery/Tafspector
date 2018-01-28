package techery.uitests.appspector.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RegisterPage {


    public RegisterPage enterUsername(String username) {
        $(By.cssSelector("input[type=\"text\"]")).val(username);
        return page(RegisterPage.class);
    }

    public RegisterPage enterEmail(String email){
        $(By.xpath("//div[2]/div[2]/input")).val(email);
        return page(RegisterPage.class);
    }

    public RegisterPage enterPassword(String password){
        $(By.cssSelector("input[type=\"password\"]")).val(password);
        return page(RegisterPage.class);
    }

    public DashboardPage submitForm(){
        $(By.cssSelector("button.as-button.default.size-lg")).click();
        return page(DashboardPage.class);
    }
}
