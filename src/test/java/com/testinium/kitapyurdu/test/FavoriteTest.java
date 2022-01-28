package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.FavoritePage;
import com.testinium.kitapyurdu.page.ProductPage;
import org.junit.Test;

public class FavoriteTest extends BaseTest {

    @Test
    public void favoriteTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
        FavoritePage favoritePage = new FavoritePage();
        favoritePage.favorite();
    }

    @Test
    public void goToFavoriteTest(){
        FavoritePage favoritePage = new FavoritePage();
        favoritePage.goToFavorite();
    }
}
