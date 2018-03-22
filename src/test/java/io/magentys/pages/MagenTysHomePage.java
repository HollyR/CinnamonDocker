package io.magentys.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.support.FindBy;

import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.clickable;

public class MagenTysHomePage {

    @FindBy(id ="home-page")
    public PageElement homePage;

    @FindBy(css = "#menu-item-2443 > a:nth-child(1)")
    public PageElement blogButton;

    public void clickBlogMenu() {
        blogButton.waitUntil(clickable).click();
    }
}
