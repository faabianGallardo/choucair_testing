package co.com.choucair.certification.testing.task;

import co.com.choucair.certification.testing.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;


    public static Complete onThePage(String strFirstName,String strLastName,String strEmail,String strMonth,String strDay,String strYear){
        return Tasks.instrumented(Complete.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOINTODAY_BUTTON),
                Enter.theValue(strFirstName).into(UtestPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UtestPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestPage.INPUT_EMAILADDRESS),
                Enter.theValue(strMonth).into(UtestPage.INPUT_MONTH),
                Enter.theValue(strDay).into(UtestPage.INPUT_DAY),
                Enter.theValue(strYear).into(UtestPage.INPUT_YEAR),
                Click.on(UtestPage.NEXT_BUTTON));

    }
}
