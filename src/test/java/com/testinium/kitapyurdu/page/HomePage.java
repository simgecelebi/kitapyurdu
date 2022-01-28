package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods = new Methods();
    }

    public void home(){
        methods.waitBySeconds(5);

        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']"))); //site iconu
        methods.click(By.xpath("//div[@class='menu-top-button login']")); //login butonu
        methods.waitBySeconds(1);
    }
}
