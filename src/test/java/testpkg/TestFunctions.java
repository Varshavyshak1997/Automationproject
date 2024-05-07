package testpkg;

import org.testng.annotations.Test;

import pagepkg.TestData;

public class TestFunctions extends BaseClass {

    @Test
    public void clickOptions() throws Exception
    {
        TestData obj = new TestData(driver);
        obj.login();
        obj.clickTab();
        obj.selectItems();
        Thread.sleep(3000);
        obj.cartFunctions();
        Thread.sleep(3000);
        obj.shipping();
        Thread.sleep(3000);
        obj.finalPlaceOrder();
    }
}