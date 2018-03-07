package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddAppPopup {

    public SelenideElement appNameField(){
        return $(By.xpath("//input"));
    }
    public SelenideElement createAppButton(){
        return $(By.xpath("//form/button"));
    }
    public AppSetupPage createApp(String appname){
        appNameField().val(appname);
        createAppButton().click();
        return new AppSetupPage();
    }
}
