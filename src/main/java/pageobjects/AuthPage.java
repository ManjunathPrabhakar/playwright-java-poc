package pageobjects;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class AuthPage {

    Page page;

    public AuthPage(Page page) {
        this.page = page;
    }

    public void perfromLogin(String uid, String pwd) {
        page.fill("//form/h3[text()='Already registered?']/..//input[contains(@name,'email')]",
                "blackgoat@test.com");
        page.fill("//form/h3[text()='Already registered?']/..//input[contains(@name,'passwd')]",
                "Black@goat123");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot-1.png")));
        page.click("//form/h3[text()='Already registered?']/..//button");
    }

}
