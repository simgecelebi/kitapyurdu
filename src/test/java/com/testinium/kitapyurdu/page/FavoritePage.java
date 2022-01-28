package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class FavoritePage {

    Methods methods;
    public FavoritePage(){
        methods = new Methods();
    }

    public void favorite(){
        methods.backToHome(By.xpath("//div[@class='logo-icon']")); //Anasayfaya dönüş
        methods.waitBySeconds(3);
    }

    public void goToFavorite(){
        methods.click(By.cssSelector(".my-list .common-sprite"));
        methods.click(By.cssSelector(".my-list li li:nth-of-type(1) > a"));
        methods.waitBySeconds(3);

    }

}
