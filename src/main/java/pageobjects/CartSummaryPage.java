package pageobjects;

import com.microsoft.playwright.Page;
import stepdefs.Init;

/**
 * @author Manjunath Prabhakar (Manjunath-PC)
 * @created 14/07/2021
 * @project playwright-demo
 */
public class CartSummaryPage {

    Page page;

    public CartSummaryPage(Init init) {
        this.page = init.getPage();
    }

    public boolean isCartEmpty() {
        return page.isVisible("//p[contains(text(),'Your shopping cart is empty.')]");
    }
}
