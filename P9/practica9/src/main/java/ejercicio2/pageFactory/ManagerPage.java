/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pageFactory;

import ejercicio1.pageFactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Cristina Rivera Baydal ( crb13@alu.ua.es )
 */
public class ManagerPage {
    WebDriver driver;
    @FindBy(xpath="//table//tr[@class='heading3']") WebElement homePageUserName;
    @FindBy(linkText="New Customer") WebElement newCustomer;
    @FindBy(linkText="Log out") WebElement logOut;
    
    public ManagerPage(WebDriver driver){
        this.driver = driver;        
    }
    public String getHomePageDashboardUserName(){
        return homePageUserName.getText();
    }
    public NewCustomerPage newCustomer(){
        newCustomer.click();
        return PageFactory.initElements(driver, NewCustomerPage.class);
    }
}
