package techery.uitests.appspector.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

  public RegisterPage clickRegistrationButton() {
    $(By.linkText("Sign up")).click();
    return page(RegisterPage.class);
  }
//  public LoginPage enterLogin(String login) {
//    $(By.cssSelector("input[type=\"text\"]")).val(login);
//    return page(LoginPage.class);
//
//  }
//
//  public LoginPage enterPassword(String password) {
//    $(By.cssSelector("input[type=\"password\"]")).val(password);
//    return page(LoginPage.class);
//  }
//
//  public DashboardPage clickLogin(){
//    $(By.xpath("//button[@type='submit']")).click();
//    return page(DashboardPage.class);
//  }
  public DashboardPage loginToTheApp(String login, String password){
    $(By.cssSelector("input[type=\"text\"]")).val(login);
    $(By.cssSelector("input[type=\"password\"]")).val(password);
    $(By.xpath("//button[@type='submit']")).click();
    return new DashboardPage();
  }


}
