package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();

        homePage.home();

    }
}
