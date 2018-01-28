package techery.uitests.appspector.tests;

import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;
import techery.uitests.appspector.pages.LoginPage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginAsNewUser {
  String url = "https://app.staging.appspector.com/login";
  String login = "kirill.puhalskiy@gmail.com";
  String password = "111111";

  @Test
  public void loginAsNewUser() {
    LoginPage page = open(url, LoginPage.class);
    DashboardPage dashboard = page.loginToTheApp(login,password);
    dashboard.addAppButton().shouldHave(text("Add app"));
  }
}
