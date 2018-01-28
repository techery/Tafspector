package techery.uitests.appspector.tests;

import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;
import techery.uitests.appspector.pages.LoginPage;
import techery.uitests.appspector.pages.RegisterPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class RegisterNewUser {

    @Test
    public void registerNewUser(){
        LoginPage page = open("https://app.staging.appspector.com/login", LoginPage.class);
        RegisterPage registerPage = page.clickRegistrationButton();
        registerPage
                .enterUsername("123Test1")
                .enterEmail("123user1@techery.io")
                .enterPassword("1231231213")
                .submitForm();
        DashboardPage dashboardPage = registerPage.submitForm();
        dashboardPage.addAppButton().shouldHave(text("Add app"));

    }

}
