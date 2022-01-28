package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.*;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
        productPage.addToFavorites();
    }
    @Test
    public void favoriteTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.checkFavorites();
    }

    @Test
    public void getTextTest(){ //Login kontrolü
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControlTest();
    }

    @Test
    public void addProductTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.selectAllBooks();
        productPage.addProduct();
        productPage.buyProduct();
        productPage.saveAdressInfo();
        productPage.pageContinue();
        productPage.cargoPageContinue();
        productPage.addCardInfo();
        productPage.cardPageContinue();
        loginPage.logout();
    }
}
