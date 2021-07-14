package pageobjects;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class LandingPage {

    Page page;

    public LandingPage(Page page) {
        this.page = page;
    }

    public void clickSignIn() {
        page.click("//a[contains(text(),'Sign in')]");
    }

    public String currentlyLoggedUserName() {
        byte[] buffer = page.screenshot();
        //System.out.println(Base64.getEncoder().encodeToString(buffer));
        //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot-2.png")));
        return page.textContent("//a[@class='account']/span");
    }
}
