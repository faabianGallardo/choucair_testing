package co.com.choucair.certification.testing.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com")
public class UtestPage extends PageObject {
    public static final Target JOINTODAY_BUTTON = Target.the("").located(By.id("//button[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("").located(By.id("lastName"));
    public static final Target INPUT_EMAILADDRESS = Target.the("").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("").located(By.id("birthYear"));
    public static final Target  NEXT_BUTTON = Target.the("").located(By.id("//button[contains(@class,'btn btn-blue')]"));
}
