package techery.uitests.appspector.tests;

import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class LoginAsNewUser extends BaseTest {

  @Test
  public void loginAsNewUser() {

    DashboardPage dashboard = page.loginToTheApp(NEWUSERLOGIN,PASSWORD);
    dashboard.addAppButtonWelcome().shouldHave(text("Add app"));
  }
}
