package com.hillel.ua.page_object.panels;

import com.hillel.ua.page_object.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderPanel extends AbstractPanel {

    private static final String BURGER_MENU_BUTTON = ".//button[@class='menu-toggle']";
    private static final String BURGER_MENU_PANEL = ".//div [@data-module-type='MainNavigation']";
    private static final String CARD_ICON = "//a[contains(@class, 'header-cart')]";
    private static final String EMPTY_CARD_MESSAGE = "//div[@class='header-cart__empty-message']";


    public HeaderPanel(final WebElementFacade panelBaseLocation, final AbstractPage driverDelegate){
        super(panelBaseLocation, driverDelegate);
    }

    public void clickBurgerMenuButton(){
        findBy(BURGER_MENU_BUTTON).click();
    }

    public BurgerMenuPanel getBurgerMenuPanel(){
        return new BurgerMenuPanel(findBy(BURGER_MENU_PANEL).waitUntilVisible(), getDriverDelegate());
    }

    public void hoverCardCheckIcon(){
        Actions action = new Actions(getDriverDelegate().getDriver());
        WebElement element = findBy(CARD_ICON);
        action.moveToElement(element).perform();
    }

    public String getEmptyCardMessageText(){
        return findBy(EMPTY_CARD_MESSAGE).getText();
    }

}
