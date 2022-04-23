package co.com.choucair.certification.testing.stepdefinitions;

import co.com.choucair.certification.testing.questions.Answer;
import co.com.choucair.certification.testing.task.Complete;
import co.com.choucair.certification.testing.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestChoucairStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that fabian wants to automate the registration in utest page$")
    public void thatFabianWantsToAutomateTheRegistrationInUtestPage(){
        OnStage.theActorCalled("Fabian").wasAbleTo(OpenUp.thePage(),(Complete.onThePage));
    }

    @When("^he search for the join today options register in utest page$")
    public void heSearchForTheJoinTodayOptionsRegisterInUtestPage(){
        OnStage.theActorCalled("Fabian").wasAbleTo(Complete.onThePage);
    }

    @Then("^find the option join today and register$")
    public void findTheOptionJoinTodayAndRegister(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
