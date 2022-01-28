package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"simgecelebii@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"2604.Simge");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
    }

    public void logout(){ //Logout olma
        methods.click(By.cssSelector("[alt='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite[href='https://www.kitapyurdu.com/index.php?route=account/account']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("[href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(3);
    }
}
