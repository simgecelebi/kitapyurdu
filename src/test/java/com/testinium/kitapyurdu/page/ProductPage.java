package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void scrollAndSelect() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.assertCheck(By.cssSelector(".common-sprite.button-search"));
        methods.scroolWithAction(By.xpath("//div[@class='product-list']//div[7]")); //7. ürüne scrool yapılır.
        methods.assertCheck(By.xpath("//div[@class='product-list']//div[7]"));
        methods.waitBySeconds(3);
    }

    public void addToFavorites(){
        for (int i=6; i<=9; i++){
            methods.favoriteProducts(By.xpath("//i[@class='fa fa-heart']"), i);
            methods.waitBySeconds(3);
        }
    }
    public void checkFavorites(){
        methods.click(By.cssSelector(".my-list .common-sprite"));
        methods.click(By.cssSelector(".my-list li li:nth-of-type(1) > a"));
        methods.assertCheck(By.cssSelector(".my-list .common-sprite"));
        methods.waitBySeconds(3);
    }

    public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("Oyuncak",value);
        methods.waitBySeconds(5);

    }
    public void selectAllBooks(){ //Tüm kitapları seçme
        methods.click(By.cssSelector(".js-bookCt > li:nth-of-type(3) > .mn-strong"));//Tüm kitaplara git
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("[href='kategori/kitap-hobi/1_212.html']"));//Hobi alanını seç
        methods.waitBySeconds(3);
    }

    public void addProduct(){
        methods.selectProduct(By.cssSelector("#content > .box > div:nth-of-type(1) .product-grid")); //ürün seçme
        methods.waitBySeconds(3);

        methods.scroolWithAction(By.xpath("//a[.='devamını oku']")); //aşağı scrool etme
        methods.assertCheck(By.xpath("//a[.='devamını oku']"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("#button-cart > span")); //sepete ekle butonuna tıklar
        methods.assertCheck(By.cssSelector("#button-cart > span"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("#cart-items")); //sepete git
        methods.assertCheck(By.cssSelector("#cart-items"));
        methods.waitBySeconds(1);

        methods.click(By.id("js-cart")); //select yapısı tekrar sepete git
        methods.assertCheck(By.id("js-cart"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("[name='quantity']")); //ürün adedi inputuna tıkla
        methods.assertCheck(By.cssSelector("[name='quantity']"));
        methods.waitBySeconds(3);

        methods.cleanInputFıeld(By.cssSelector("[name='quantity']")); //input alanını temizle
        methods.assertCheck(By.cssSelector("[name='quantity']"));
        methods.waitBySeconds(3);

        methods.sendKeys(By.cssSelector("[name='quantity']"),"2"); //inputa yeni değer gir
        methods.waitBySeconds(3);

        methods.click(By.cssSelector(".fa-refresh")); //ürünü güncelle
        methods.waitBySeconds(3);
    }

    public void buyProduct(){
        methods.click(By.cssSelector("div.right > .button")); //ürünü satın al
        methods.assertCheck(By.cssSelector("div.right > .button"));
        methods.waitBySeconds(3);
    }

    public void saveAdressInfo(){
        methods.click(By.cssSelector("[onclick='setShippigAddressType(\\'new\\')']")); //Yeni adres alanına tıkla
        methods.assertCheck(By.cssSelector("[onclick='setShippigAddressType(\\'new\\')']"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='address-firstname-companyname']"));//Ad alanına tıkla
        methods.assertCheck(By.xpath("//input[@id='address-firstname-companyname']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='address-firstname-companyname']"),"Simge"); //Adı gir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='address-lastname-title']"));//Soyadı alanına tıkla
        methods.assertCheck(By.xpath("//input[@id='address-lastname-title']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='address-lastname-title']"),"Celebi"); //Soyadı gir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//select[@id='address-country-id']")); //Ülke alanına tıkla
        methods.assertCheck(By.xpath("//select[@id='address-country-id']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//select[@id='address-country-id']"),"Türkiye"); //Ülke seçilir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//select[@id='address-zone-id']")); //Şehir alanına tıkla
        methods.assertCheck(By.xpath("//select[@id='address-zone-id']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//select[@id='address-zone-id']"),"İstanbul"); //Şehir seçilir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//select[@id='address-county-id']")); //İlçe alanına tıkla
        methods.assertCheck(By.xpath("//select[@id='address-county-id']"));
        methods.waitBySeconds(5);
        methods.selectByText(By.xpath("//select[@id='address-county-id']"),"BAĞCILAR"); //İlçe seçilir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='district']")); //Mahalle alanına tıkla
        methods.assertCheck(By.xpath("//input[@id='district']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='district']"),"YILDIZTEPE MAH"); //Mahalle adı girilir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//textarea[@id='address-address-text']")); //Adres alanına tıkla
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//textarea[@id='address-address-text']"),"Lavanta Sokak No:20"); //Adres gir
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='address-telephone']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='address-telephone']"),"5481231212"); //Telefon alanı
        methods.waitBySeconds(3);

        methods.click(By.xpath("//input[@id='address-mobile-telephone']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='address-mobile-telephone']"),"5481231212");//Telefon alanı
        methods.waitBySeconds(3);
    }
    public void pageContinue(){
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));//Devam butonuna tıkla
        methods.waitBySeconds(3);
    }
    public void cargoPageContinue(){
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));//Devam butonuna tıkla
        methods.waitBySeconds(3);
    }

    public void addCardInfo(){
        methods.click(By.xpath("//input[@id='credit-card-owner']")); //Kart sahibinin adı tıkla
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"),"Simge Çelebi");
        methods.waitBySeconds(3);
    }
    public void cardPageContinue(){
        methods.click(By.xpath("//button[@id='button-checkout-continue']"));//Devam butonuna tıkla
        methods.waitBySeconds(5);

    }
    public void cardLimitCheck(){ //kart kontrolü
        String text = methods.getText(By.xpath("//div[@class='warning']"));
    }
}


