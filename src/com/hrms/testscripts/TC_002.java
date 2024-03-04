package com.hrms.testscripts;
import com.hrms.lib.General;
public class TC_002 {
public static void main(String []args) {
	General gnl = new General();
	gnl.openApplication();
	gnl.login();
	gnl.enterFrame();
	gnl.editEmployee();
	gnl.exitFrame();
	gnl.logOut();
	gnl.closeApplication();
}
}
