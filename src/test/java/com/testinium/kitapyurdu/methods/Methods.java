package com.testinium.kitapyurdu.methods;

import com.testinium.kitapyurdu.driver.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods(){
        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){ //By elementi locatorlara yönlendirir.

        return  wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }

    public void click(By by){
        findElement(by).click();
    } //Click özelliği gereken yerlerde kullanılır.

    public void waitBySeconds(long seconds){ //Ekran bekleme süresi
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }//Elementi bulana kadar bekler
    }

    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    } //Text yazdırmamız gereken yerlerde kullanırız.

    public void scroolWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollWithJavaScript(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));

    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text){
        getSelect(by).selectByVisibleText(text);

    }

    public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getValue(By by){ //input alanlarını gösterir.
        return jsdriver.executeScript("return arguments[0].value",findElement(by)).toString();
    }
    public void favoriteProducts(By by, int index){
        findElements(by).get(index).click();
    }

    public void selectProduct(By by){ //Random ürün seçme
        Random random = new Random();
        List<WebElement> products = findElements(by);
        int index = random.nextInt(products.size());
        products.get(index).click();
    }

    public void backToHome(By by){
        findElement(by).click();
    }

    public void cleanInputFıeld(By by){ //input alanını temizleme
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    public void assertCheck(By by){
        WebElement web = driver.findElement(by);
        boolean bool = web.isDisplayed();
        Assert.assertEquals(true, bool);

    }

}
