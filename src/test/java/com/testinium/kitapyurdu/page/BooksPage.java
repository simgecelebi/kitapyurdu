package com.testinium.kitapyurdu.page;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class BooksPage {
    Methods methods;
    public BooksPage(){
        methods = new Methods();
    }

    public void pointsCatalog(){
        methods.click(By.cssSelector(".common-sprite[href='puan-katalogu']"));
        methods.waitBySeconds(3);
        methods.scroolWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
    }

    public void selectTurkishClassics(){
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".sort > select"));
        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector(".sort > select"),"Yüksek Oylama");
        methods.waitBySeconds(3);
    }
}
