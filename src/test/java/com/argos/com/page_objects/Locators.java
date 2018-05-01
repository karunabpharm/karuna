package com.argos.com.page_objects;

import com.argos.com.drivers.BroserLaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BroserLaunch {
   public static String productName;

    public void enterSearchbox(String items){
        driver.findElement(By.id("searchTerm")).sendKeys(items);
    }
    public void clickSearchbox(){
        driver.findElement(By.className("argos-header__search-button")).click();
    }
    public void ClickSelectedItem(){
        driver.findElement(By.className(" add-to-trolley-button button button--primary button--full add-to-trolley-button--beta")).click();
    }
    public void GotoTrolley(){
        driver.findElement(By.linkText("Go to Trolley")).click();

    }
    public String ItemAddedSucessfully(){
        driver.findElement(By.className("argos-header__trolley-count argos-header__trolley-badge badge")).click();
        return null;
    }

    public String getTextOnSerchPage(){
       return driver.findElement(By.cssSelector(".search-title__term")).getText();
    }

    public void selectAProduct() {
      WebElement productNameElement= driver.findElement(By.cssSelector(".ac-product-name.ac-product-card__name"));
      productName= productNameElement.getText();
     productNameElement.click();
     sleep();
    }

    public void addProductToTrolle() {
        driver.findElement(By.cssSelector(".add-to-trolley-button")).click();

    }

    public String getProductInBasket() {
       return driver.findElement(By.cssSelector(".description>strong>a")).getText();
    }
}
