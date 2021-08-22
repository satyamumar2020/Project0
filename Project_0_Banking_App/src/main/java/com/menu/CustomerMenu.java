package com.menu;

import com.dao.DataStore;

import come.model.Register;

public class CustomerMenu {
	
	public static void customerMenu(String type,Register register) {
		
		DataStore data = new DataStore();
		
		System.out.println("-------Customer Menu--------");
		
		if(data.checkStatus(register.getAccountId())) {
			try {
				System.out.println("--------- Welcome "+ register.getName()+" to our Customer app ----------");
				System.out.println();
	     		System.out.println(register.printSingleObject());
				int a = 0;
				
				System.out.println(" 1.=>  Show Details");
				System.out.println(" 2.=>  Upgrade your details");
				System.out.println(" 3.=>  Show Balance");
				System.out.println(" 4.=>  For Banking Operations");
				System.out.println(" 7.=>  Delete your account");
				System.out.println(" 8.=>  LogOut");
				System.out.println(" 9.=>  Exit");
				
				
				switch(a) {
				case 1:
					System.out.println(register.printSingleObject());
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				default:
					break;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Your account is in rejected...");
			System.out.println("------Please contact with your employee------");
		}
		
	}

}
