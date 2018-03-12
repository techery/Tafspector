package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

  public RegisterPage clickRegistrationButton() {
    $(By.linkText("Sign up")).click();
    return new RegisterPage();
  }
  public SelenideElement checkLoginPage() {
    return $(By.cssSelector("Legend.formTitle"));
  }

  public DashboardPage loginToTheApp(String login, String password){
    $(By.cssSelector("input[type=\"text\"]")).val(login);
    $(By.cssSelector("input[type=\"password\"]")).val(password);
    $(By.xpath("//button[@type='submit']")).click();
    return new DashboardPage();
  }


}
