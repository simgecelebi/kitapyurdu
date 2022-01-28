package com.testinium.kitapyurdu.test;

import com.testinium.kitapyurdu.driver.BaseTest;
import com.testinium.kitapyurdu.page.BooksPage;
import org.junit.Test;

public class BooksTest extends BaseTest {

    @Test
    public void pointsCatalogTest(){
        BooksPage booksPage = new BooksPage();
        booksPage.pointsCatalog();
    }

    @Test
    public void selectTurkishClassicsTest(){
        BooksPage booksPage = new BooksPage();
        booksPage.selectTurkishClassics();
    }
}
