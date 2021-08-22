package com.getsetdetails;

import java.util.Scanner;

import come.model.Login;

public class LoginDetails {
	

	public static Login loginDetails() throws Exception {
		
		Scanner sc = new Scanner(System.in);

		Login log = new Login();
		int accountId = 0;
		String password = null;
		
		

		System.out.println("For Login Entre the Specifics Details");
	
		
		System.out.println("Entre Your Account Number:-");
		accountId = sc.nextInt();
		log.setAccountId(accountId);
			
		
		System.out.println("Entre Unique Password:-");
		sc.nextLine();
		password = sc.nextLine();
		log.setPassword(password);

		if (log.matchData()) {
//			System.out.println("Your log in Successfully!!!");
		} else {
//			System.out.println("!!!!!!!!Your log in not Successful!!!");
//			System.out.println("Please fill correct details");
//			throw new Exception("Login details is Invalid");

		}
		return log;
		

	}

}
