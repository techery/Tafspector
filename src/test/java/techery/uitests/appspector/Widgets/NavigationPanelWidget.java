package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationPanelWidget {
    public SelenideElement organizationDropdown(){ return  $(By.id("organizations"));}
    public SelenideElement userMenu(){ return $(By.id("user-profile")); }
    public SelenideElement logoutItem(){return $(By.xpath("//div[3]/div[2]/div[2]")); }
    public SelenideElement logoAppspector(){return $(By.id("logo"));}


    public LoginPage logoutFromMenu(){
        userMenu().click();
        logoutItem().click();
        return new LoginPage();
    }

    public DashboardPage backToDashboard(){
        logoAppspector().click();
        return new DashboardPage();
    }


}
