package techery.uitests.appspector.tests;

import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;

import static com.codeborne.selenide.Condition.text;

public class CreateNewApp extends BaseTest {
    @Test
    public void createNewApp(){
        DashboardPage dashboardPage = page.loginToTheApp(defaultuser,defaultpass);
        dashboardPage.addApplication()
                .getAddAppPopup().createApp(appname)
                .goToSessionsPage()
                .getNavigationPanelWidget().backToDashboard()
                .appListItem().shouldHave(text(appname));
    }
}
