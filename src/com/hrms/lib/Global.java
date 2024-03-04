package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
public WebDriver driver;
public String url   = "http://183.82.103.245/nareshit/login.php";
public String un    = "nareshit";
public String pw    = "nareshit";
public String efm   = "Papali";
public String elm   = "Selenium";
public String emp   = "Emp. First Name";
public String nefm  = "Priya";
public String nelm  = "Rout";


public String txt_loginname = "txtUserName";
public String txt_password  = "txtPassword";
public String btn_login     = "Submit";
public String btn_Add       = "//input[@value='Add']";//xpath
public String txt_efm       = "txtEmpFirstName";
public String txt_elm       = "txtEmpLastName";
public String btn_save      = "btnEdit";
public String txt_select    = "loc_code";
public String txt_search    = "loc_name";
public String btn_search    = "//input[@type='button']";//xpath
public String txt_Abinash   = "//*[@id=\"standardView\"]/table/tbody/tr/td[3]/a";//xpath
public String btn_edit      = "EditMain";//name
public String link_logout   = "Logout";
public String frame_info    = "rightMenu";
public String btn_checkbox  = "allCheck";
public String btn_delet     = "//input[@value='Delete']";//xpath
public String btn_save2     = "EditMain";
}
