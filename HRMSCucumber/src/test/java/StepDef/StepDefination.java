package StepDef;

import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Property.LoginDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
public WebDriver driver;
private Properties logd = LoginDetails.logInfo();
String UserName = logd.getProperty("UserName");
String Password = logd.getProperty("Password");
String UserName1 = logd.getProperty("UserName1");
String Password1 = logd.getProperty("Password1");
String Titel1   = logd.getProperty("Titel");
String Titel2   = logd.getProperty("Titel1");
String EmpFname = logd.getProperty("EmpFname");
String EmpLname = logd.getProperty("EmpLname");

@Given("^OpenApplication$")
public void openApplication() {
    driver = new ChromeDriver();
	String Url = logd.getProperty("Url");
	driver.navigate().to(Url);
	System.out.println("Application Opened");
	System.out.println(driver.getTitle());
	
}

@When("^Login With <UserName> and <Password>$")
public void logIn() {
	driver.findElement(By.name("txtUserName")).sendKeys(UserName);
	driver.findElement(By.name("txtPassword")).sendKeys(Password);
	driver.findElement(By.name("Submit")).click();
	if(driver.getTitle().equals(Titel1))
	{
		System.out.println("Login Completed");
	}
	else {
		System.out.println("Login InComplted");
	}
	
	
}

@And("^Logout$")
public void logOut() {
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout Completed");
}
@Then("^CloseApplication$")
public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
	
}
@When("^Login With <UserName1> and <Password>$")
public void login_With_Invalid_Id() {
	driver.findElement(By.name("txtUserName")).sendKeys(UserName1);
	driver.findElement(By.name("txtPassword")).sendKeys(Password);
	driver.findElement(By.name("Submit")).click();
	if(driver.getTitle().equals(Titel2))
	{
		System.out.println("Login Completed");
	}
	else {
		System.out.println("Login InComplted");
	}

}
@When("^Login With <UserName> and <Password1>$")
public void login_with_Invalid_Password() {
	driver.findElement(By.name("txtUserName")).sendKeys(UserName);
	driver.findElement(By.name("txtPassword")).sendKeys(Password1);
	driver.findElement(By.name("Submit")).click();
	if(driver.getTitle().equals(Titel2))
	{
		System.out.println("Login Completed");
	}
	else {
		System.out.println("Login InComplted");
	}
}
@When("^Login With <UserName1> and <Password1>$")
public void login_with_Invalid_Id_and_Password() {
	driver.findElement(By.name("txtUserName")).sendKeys(UserName1);
	driver.findElement(By.name("txtPassword")).sendKeys(Password1);
	driver.findElement(By.name("Submit")).click();
	if(driver.getTitle().equals(Titel2))
	{
		System.out.println("Login Completed");
	}
	else {
		System.out.println("Login InComplted");
	}
}

@And("^AddEmplyoee$")
public void addEmployee() throws Exception {
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys(EmpFname);
	driver.findElement(By.name("txtEmpLastName")).sendKeys(EmpLname);
	Thread.sleep(3000);
	driver.findElement(By.id("btnEdit")).click();
	System.out.println("New Epmlyoee Added");
	driver.switchTo().defaultContent();
	}
@And("^SearchEmplyoee$")
public void searchEmplyoee() throws Exception {
	driver.switchTo().frame("rightMenu");	
	Select st = new Select(driver.findElement(By.id("loc_code")));
	st.selectByVisibleText("Emp. First Name");
	driver.findElement(By.name("loc_name")).sendKeys(EmpFname);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
	Thread.sleep(3000);
}
@Then("^DeletEmplyoee$")
public void deletEmplyoee() throws Exception {
	driver.findElement(By.name("chkLocID[]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
	Thread.sleep(3000);
	System.out.println("Employee deleted");
	driver.switchTo().defaultContent();
}
}
