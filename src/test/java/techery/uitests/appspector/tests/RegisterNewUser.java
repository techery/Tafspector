package techery.uitests.appspector.tests;

import org.junit.Test;
import techery.uitests.appspector.pages.DashboardPage;
import techery.uitests.appspector.pages.LoginPage;
import techery.uitests.appspector.pages.RegisterPage;
import techery.uitests.appspector.pages.TermsAndConditions;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class RegisterNewUser extends BaseTest {


    @Test
    public void registerNewUser(){
        LoginPage page = open(url, LoginPage.class);
        RegisterPage registerPage = page.clickRegistrationButton();
        registerPage
                .enterUsername(username)
                .enterEmail(email)
                .enterPassword(defaultpass)
                .submitForm();
        TermsAndConditions termsAndConditions = registerPage.submitForm();
        DashboardPage dashboardPage = termsAndConditions.acceptTerms();
        dashboardPage.addAppButtonWelcome().shouldHave(text("Add app"));

    }

}
