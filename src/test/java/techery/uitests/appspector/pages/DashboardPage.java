package techery.uitests.appspector.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {

  public SelenideElement addAppButton(){ return $(By.cssSelector("button.as-button.default.size-lg")); }
}
