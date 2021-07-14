package stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class Init {

    Playwright playwright;
    Browser browser;
    Page page;
    PageObjectManager pageObjectManager;

    @Before
    public void before(Scenario s) throws Exception {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("http://automationpractice.com/index.php");


        pageObjectManager = new PageObjectManager(page);
    }

    @After
    public void after(Scenario s) throws Exception {
        page.close();
        browser.close();
        playwright.close();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public Page getPage() {
        return page;
    }
}
