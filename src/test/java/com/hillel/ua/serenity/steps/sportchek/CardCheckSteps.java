package com.hillel.ua.serenity.steps.sportchek;

import com.hillel.ua.page_object.pages.SportchekMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CardCheckSteps extends ScenarioSteps {

    private SportchekMainPage sportchekMainPage;

    public CardCheckSteps(final Pages pages){
        this.sportchekMainPage = pages.getPage(SportchekMainPage.class);
    }

    @Step
    public String getEmptyCardMessageText(){
        return sportchekMainPage.getHeaderPanel().getEmptyCardMessageText();
    }

}
