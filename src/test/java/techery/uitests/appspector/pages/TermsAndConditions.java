package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TermsAndConditions {

    public SelenideElement acceptTermsButton(){ return $(By.xpath("//div[@id='app']/div/div[3]/button")); }

    public DashboardPage acceptTerms(){
        acceptTermsButton().click();
        return new DashboardPage();
    }

    }

