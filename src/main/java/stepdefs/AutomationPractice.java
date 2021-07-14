package stepdefs;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AuthPage;
import pageobjects.LandingPage;

import java.nio.file.Paths;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class AutomationPractice {

    LandingPage landingPage;
    AuthPage authPage;

    public AutomationPractice(Init init) {
        landingPage = init.getPageObjectManager().getLandingPage();
        authPage = init.getPageObjectManager().getAuthPage();
    }

    @Given("User Logs in to web page")
    public void userLogsInToWebPage() {
        landingPage.clickSignIn();
        authPage.perfromLogin("blackgoat@test.com", "Black@goat123");
    }


    @Then("Validate if user name is reflecting")
    public void validateIfUserNameIsReflecting() {
        String userName = landingPage.currentlyLoggedUserName();

        if (userName.equalsIgnoreCase("black goat")) {
            System.out.println("Success");
        } else {
            System.err.println("Failure");
        }
        System.out.println("Expected Black Goat, Found " + userName);

//        Object dimensions = page.evaluate("() => {\n" +
//                "  return {\n" +
//                "      width: document.documentElement.clientWidth,\n" +
//                "      height: document.documentElement.clientHeight,\n" +
//                "      deviceScaleFactor: window.devicePixelRatio\n" +
//                "  }\n" +
//                "}");
//        System.out.println(dimensions);
    }
}
