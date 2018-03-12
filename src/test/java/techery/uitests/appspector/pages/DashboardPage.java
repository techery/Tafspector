package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import techery.uitests.appspector.Widgets.AddAppPopup;
import techery.uitests.appspector.Widgets.NavigationPanelWidget;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

  NavigationPanelWidget navPanWidget = new NavigationPanelWidget();

  AddAppPopup addAppPopup = new AddAppPopup();

  public SelenideElement addAppButtonWelcome(){ return $(By.xpath("//div[@id='welcome-page']/button")); }
  public SelenideElement appListItem(){return $(By.xpath("//div[@id='apps']/div/div/span[2]"));}

  public DashboardPage addApplication(){
    addAppButtonWelcome().click();
    return new DashboardPage();
  }


  public NavigationPanelWidget getNavPanWidget(){ return navPanWidget; }

  public AddAppPopup getAddAppPopup() { return addAppPopup; }

}
