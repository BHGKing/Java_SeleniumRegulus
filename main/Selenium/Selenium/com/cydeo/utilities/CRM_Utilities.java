package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
This class will store the method related to CRM project.
 */
public class CRM_Utilities {

    /*
    This method will log in using below credentials.
    @Username: helpdesk1@cydeo.com
    @Password: UserUser
        //hr1@cybertekschool.com,
        //hr100@cybertekschool.com,
        //helpdesk1@cybertekschool.com,
        //helpdesk45@cybertekschool.com
        //marketing10@cybertekschool.com
        //marketing 74@cybertekschool.com
     */
    public static void login_crm(WebDriver driver){

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to`LogIn`button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    public static void login_crm(WebDriver driver, String username, String password){

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        //5. Click to`LogIn`button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

}
