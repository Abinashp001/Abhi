package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global{
public void openApplication() {
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Oppened");
}
public void closeApplication() {
	driver.close();
	System.out.println("Application Closed");
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login SuccessFull");
}
public void logOut() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("LogOut successFull");
}
public void enterFrame() {
	driver.switchTo().frame(frame_info);
	System.out.println("Entered to Frame");
}
public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from Frame");
}
public void addEmploye() {
	driver.findElement(By.xpath(btn_Add)).click();
	driver.findElement(By.name(txt_efm)).sendKeys(efm);
	driver.findElement(By.name(txt_elm)).sendKeys(elm);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("New Employe Added");
}
public void deletEmploye() {
	driver.findElement(By.name(txt_select)).sendKeys(emp);
	driver.findElement(By.name(txt_search)).sendKeys(efm);
	driver.findElement(By.xpath(btn_search)).click();
	driver.findElement(By.name(btn_checkbox)).click();
	driver.findElement(By.xpath(btn_delet)).click();
	System.out.println("Delete Successfull");
}
public void editEmployee() {
	driver.findElement(By.name(txt_select)).sendKeys(emp);
	driver.findElement(By.name(txt_search)).sendKeys(efm);
	driver.findElement(By.xpath(btn_search)).click();
	driver.findElement(By.xpath(txt_Abinash)).click();
	driver.findElement(By.name(btn_edit)).click();
	driver.findElement(By.name(txt_efm)).clear();
	driver.findElement(By.name(txt_efm)).sendKeys(nefm);
	driver.findElement(By.name(txt_elm)).clear();
	driver.findElement(By.name(txt_elm)).sendKeys(nelm);
	driver.findElement(By.name(btn_save2)).click();
	System.out.println("Edit Employee Successfull");
}
}
