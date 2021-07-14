package pageobjects;

import com.microsoft.playwright.Page;
import stepdefs.Init;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class ContactUsPage {

    Page page;

    public ContactUsPage(Init init){
        this.page = init.getPage();
    }
}
