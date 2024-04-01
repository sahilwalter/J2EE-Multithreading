package com.jspiders.multithreading.main;
import com.jspiders.multithreading.resource.*;

public class AccountMain {
	public static void main(String[]args) {
		Account account  = new Account();
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
	}

}
