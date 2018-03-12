package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AppSetupPage {

    public SelenideElement skipButton(){
        return $(By.xpath("//div[@id='header']/button"));
    }
    public AppSessionsPage goToSessionsPage(){
        skipButton().click();
        return new AppSessionsPage();
    }
}
