package techery.uitests.appspector.tests;


import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;
import static com.codeborne.selenide.Condition.text;


public class LogoutFromDashboard extends BaseTest{
    @Test
    public void logoutFromDashboard(){
        DashboardPage dashboardPage = page.loginToTheApp(DEFAULTUSER,defaultpass);
        dashboardPage.getNavPanWidget().logoutFromMenu().checkLoginPage().shouldHave(text("Login"));
    }
}
