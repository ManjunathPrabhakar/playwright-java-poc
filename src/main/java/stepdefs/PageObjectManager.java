package stepdefs;

import com.microsoft.playwright.Page;
import pageobjects.AuthPage;
import pageobjects.LandingPage;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class PageObjectManager {

    private LandingPage landingPage;
    private AuthPage authPage;

    public PageObjectManager(Page page) {
        this.landingPage = new LandingPage(page);
        this.authPage = new AuthPage(page);
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }

    public AuthPage getAuthPage() {
        return authPage;
    }
}
