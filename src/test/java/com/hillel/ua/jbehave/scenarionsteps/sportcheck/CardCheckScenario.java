package com.hillel.ua.jbehave.scenarionsteps.sportcheck;

import com.hillel.ua.serenity.steps.sportchek.CardCheckSteps;
import com.hillel.ua.serenity.steps.sportchek.HeaderPanelSteps;
import com.hillel.ua.serenity.steps.sportchek.SportCheckMainPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.unitils.reflectionassert.ReflectionAssert;

public class CardCheckScenario {

    @Steps
    private SportCheckMainPageSteps sportCheckMainPageSteps;

    @Steps
    private HeaderPanelSteps headerPanelSteps;

    @Steps
    private CardCheckSteps cardCheckSteps;

    @Given("opening site with next url: '$url'")
    public void openSite(final String url){
        sportCheckMainPageSteps.openPage(url);
    }

    @When("user hovers card icon")
    public void cardHovering(){
        headerPanelSteps.cardHovering();
    }

    @Then("following message are displayed: '$message'")
    public void emptyCardMessage(final String message){
        String actual = cardCheckSteps.getEmptyCardMessageText();
        Assert.assertNotNull("Actual message not found", actual);
        ReflectionAssert.assertReflectionEquals("Actual message is not equals to expected",
                message.toLowerCase(),
                actual.toLowerCase());
    }
}
