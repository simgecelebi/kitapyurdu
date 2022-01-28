package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Test
    public void logoutTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.logout();
    }
}

