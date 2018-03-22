package io.magentys.pages;

import io.magentys.cinnamon.webdriver.collections.PageElementCollection;
import io.magentys.cinnamon.webdriver.elements.PageElement;
import org.openqa.selenium.support.FindBy;

import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;

public class GooglePage {

    @FindBy(id = "lst-ib")
    public PageElement searchBox;

    @FindBy(css = "#rso div.bkWMgd")
    public PageElementCollection resultLine;


    public boolean isPresentInResult(String name) {
        return resultLine.first(textContains(name)).isPresent();
    }
}
