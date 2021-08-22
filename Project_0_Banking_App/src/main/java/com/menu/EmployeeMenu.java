package com.menu;

import java.util.List;
import java.util.Scanner;

import com.dao.DataStore;
import com.getsetdetails.RagisterDetails;

import come.model.Login;
import come.model.Register;

public class EmployeeMenu {
	static DataStore data  = new DataStore();
	static Register register = null;
	
	public static boolean doApprovedRejected(String type) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for Approved \nPress 2 for rejected\nany other key to go beack to employee menu");
		int a = sc.nextInt();
		System.out.println("Entre the Id of Customer");
		int id = sc.nextInt();
		boolean x = data.isExists(type, id);
		
		boolean bool = false;
		if(x) {		
			if(a==1) {
				
				bool = data.approveCustomerById(id);
				return bool;
				
			}
			else if(a==2) {
				
				bool = data.rejectCustomerById(id);
				return bool;
			}
				
		}
		else {
			System.out.println("Informaion Incorrect....");
			System.out.println("Try Again....");
		}
		return bool;
		
			
	}
	
	public static void employeeMenu(String type,Register reg) {
		Scanner sc = new Scanner(System.in);
		DataStore data = new DataStore();
		System.out.println("--------Employee Menu---------");
		
		
	}

}
