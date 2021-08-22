package com.menu;

import java.util.Scanner;

import com.dao.DataStore;
import com.getsetdetails.LoginDetails;
import com.getsetdetails.RagisterDetails;
import com.getsetdetails.ResetDetails;

import come.model.Login;
import come.model.Register;
import come.model.Reset;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	static long x = 1000;
	DataStore data = new DataStore();
	
	public static boolean checkYesNo() {
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre 1 for Yes and 0 for NO");
		b = sc.nextInt();
		if (b != 1) {
			return false;
		}
		else
			return true;
	}
	
	public String cheakType() throws Exception {
		System.out.println();
		System.out.println("Entre the Type of Account");
		System.out.println(" E. As for Employee account ");
		System.out.println(" C. As for Customer account ");
		System.out.println();
		char c = sc.next().charAt(0); 
		char accType = Character.toUpperCase(c);
		if(accType=='E') {
			return "employees";
		}else if(accType == 'C') {
			return "customers";
		}
		else {
			throw new Exception("This is not valid");
		}
	}
	
	public static void cheakExit() {
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre 0 for exit or other key for Continue");
		b = sc.nextInt();
		if (b == 0) {
			System.out.println("Thanks For Using my app");
			System.out.println("!!!!!!!!!!!!Visit Again!!!!!!!!!");
			System.exit(0);
		}
	}
	


	public void firstMethod(int a, String type) throws Exception {


		switch (a) {
		case 1:
			System.out.println("For Registration Entre the Specifics Details");
			Register ragister = RagisterDetails.registerDetails();
			System.out.println(ragister.getName());
			int accountId = data.addDataIntoTable(type, ragister);
			ragister.setAccountId(accountId);
			if(accountId==0) {
				System.out.println("Data Not saved");
			}
			else {
				if(type=="employees") {
					System.out.println("Your Employee Registration Successfull");
					System.out.println("Generationg a Employee Id...");
					Thread.sleep(3000);
					
				}	
				else {
					
				System.out.println("Your Customer account Registration Succesfull");
				System.out.println("Generating a account number... please wait...");
				Thread.sleep(3000);
				}
				System.out.println("Welcome to our banking app");
				System.out.println("Your Data saved with your account Number is:- "+ ragister.getAccountId()+" and Password is:- "+ragister.getNew_Password());
				System.out.println("Note:- Please save your account Number for login");
			}
			break;
		case 2:

			Login log = LoginDetails.loginDetails();
			Register reg = data.cheakIntoTable(type, log.getAccountId(), log.getPassword());

			if(type=="employees")
				EmployeeMenu.employeeMenu(type, reg);
			else
				CustomerMenu.customerMenu(type,reg);

			break;
		case 3:

			Reset reset = ResetDetails.resetDetails();
			Login login = data.getResetDetails(type, reset.getName(), reset.getPhoneNumber(), reset.getAadharCard());
			System.out.println("This is Your Details for login");
			System.out.println("Account Number:- "+ login.getAccountId());
			System.out.println("Password is:- "+ login.getPassword());
			
			ResetMenu.resetMenu(type,login.getAccountId(), reset);
			
			System.out.println("what you forget");
			System.out.println("ENtre the New password:-");
			sc.nextLine();
//			change_Password = sc.nextLine();
//			reset.changePassword(change_Password);
//			System.out.println("Your Password successfully changed "+change_Password);

			System.out.println("Details incorrect");
			

			break;
		case 4:
			System.out.println("          "
					+ ""
					+ " "					                															
					+ "                                    -Basic Information about ~'Satyam's' Banking Application System "
					+ "                                                                                              "
					+ "  --------------------------------------------------------------\r\n"
					                
					+ "           1.As a user, I can login.  \r\n"
					+ "\r\n"
					+ "           2.As a customer, I can apply for a new bank account witha starting balance.\r\n"
					+ "\r\n"
					+ "           3.As a customer, I can view the balance of a specific account.\r\n"
					+ "\r\n"
					+ "           4.As a customer, I can make a withdrawal or deposit to a specific account.\r\n"
					+ "\r\n"
					+ "           5.As the system, I reject invalid transactions\r\n"
					+ "\r\n"
					+ "           6.A withdrawal that would result in a negative balance.\r\n"
					+ "\r\n"
					+ "           7.A deposit or withdrawal of negative money.\r\n"
					+ "\r\n"
					+ "           8.As an employee, I can approve or reject an account.\r\n"
					+ "\r\n"
					+ "           9.As an employee, I can view a customer's bank accounts.\r\n"
					+ "\r\n"
					+ "           10.AS a user, I can register for a customer account.\r\n"
					+ "\r\n"
					+ "           11.As a customer, I can post a money transfer to another account.\r\n"
					+ "\r\n"
					+ "           12.As a customer, I can accept a money transfer from another account.\r\n"
					+ "\r\n"
					+ "           13.As an employee, I can view a log of all transactions.\r\n"
					+ "\r\n"
					+ "--------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
					
					+ "          -Technical Information about ~Satyam's Banking Operation System\r\n"
					+ "          ---------------------------------------------------------------\r\n"
					+ "\r\n"
					+ "                                                                                                 \r\n"
					+ "App.java=>  prints as \"Welocme To Satyam's banking App\"\r\n"
					+ "            created object as Main and call to the main()\r\n"
					+ "\r\n"
					+ "MainMenu.java=>  prints  \r\n"
					+ "                      (\"Entre the Type of Account\");\r\n"
					+ "		      (\" E. As for Employee account \");\r\n"
					+ "		     (\" C. As for Customer account \");\r\n"
					+ "\r\n"
					+ "                       1.public static boolean checkYesNo\r\n"
					+ "                       2.public String cheakType() throws Exception\r\n"
					+ "                       3.public static void cheakExit() \r\n"
					+ "                       4.public void firstMethod(int a, String type)throws                       \r\n"
					+ "                    Exception {switch (a) {\r\n"
					+ "		   case 1,2,3,4,5,default-6\r\n"
					+ "                       5.public static void Menu(String type)\r\n"
					+ "		\r\n"
					+ "                      \r\n"
					+ "\r\n"
					+ "E=>Employee account \"--------Employee Menu---------\"\r\n"
					+ " \r\n"
					+ "                  public static boolean doApprovedRejected(String type)  \r\n"
					+ "                  1.bool = data.approveCustomerById(id);\r\n"
					+ "                  2.bool = data.rejectCustomerById(id);\r\n"
					+ "                   \r\n"
					+ "C=>Customer account \"-------Customer Menu--------\"\r\n"
					+ "                   1.data.checkStatus(register.getAccountId())\r\n"
					+ "                   \r\n"
					+ "				System.out.println(\" 1.=>  Show Details\");\r\n"
					+ "				System.out.println(\" 2.=>  Upgrade yourdetails\");\r\n"
					+ "				System.out.println(\" 3.=>  Show Balance\");\r\n"
					+ "				System.out.println(\" 4.=>  For Banking Operations\");\r\n"
					+ "				System.out.println(\" 7.=>  Delete your account\");\r\n"
					+ "				System.out.println(\" 8.=>  LogOut\");\r\n"
					+ "				System.out.println(\" 9.=>  Exit\");\r\n"
					+ "3.For Reset Password=>\r\n"
					+ "                System.out.println(\"If you want to change your password:--\");\r\n"
					+ "		           System.out.println(\"Press 1 for change passowrd\");\r\n"
					+ "		           System.out.println(\"Press any other key for go to menu\");\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "----com.dao----(DATA ACCESS OBJECT)----\r\n"
					+ "               here we can do manupulate data like \r\n"
					+ "               CREATE GET UPDATE DELETE DATA,\r\n"
					+ "               TO ISOLATE THE APPLICATION\r\n"
					+ "                TO REDUCE THE COUPLING LOGIC\r\n"
					+ "              LIKE WE HAVE USED HERE LAYER OF JDBC API\r\n"
					+ "\r\n"
					+ " Data.Store.java=>    \r\n"
					+ "             1.DataStore ,2.implements DataStoreMethod \r\n"
					+ "              (i)-hr.employees\r\n"
					+ "              (ii)-hr.customers\r\n"
					+ "              (iii)-hr.customeraccount \r\n"
					+ "      1. add done\r\n"
					+ "	public int addDataIntoTable\r\n"
					+ "      2. Check done\r\n"
					+ "	public Register cheakIntoTable\r\n"
					+ "      3. update done\r\n"
					+ "  	public boolean updateDataIntoTable\r\n"
					+ "      4. Delete done\r\n"
					+ "	public boolean deleteDataIntoTable\r\n"
					+ "      5. Get All Details\r\n"
					+ "	public Register getAllDetails\r\n"
					+ "      6.Approve All CustomerId\r\n"
					+ "	public boolean approveAllCustomerId\r\n"
					+ "      7.Reject All CustomerId\r\n"
					+ "	public boolean rejectAllCustomerId\r\n"
					+ "      8.\r\n"
					+ "	public boolean approveCustomerById\r\n"
					+ "      9.\r\n"
					+ "	public boolean rejectCustomerById\r\n"
					+ "      10.//balance included\r\n"
					+ "	public List<Register> showCustomerDetails\r\n"
					+ "      11.View Balance\r\n"
					+ "	public int viewBalance\r\n"
					+ "      12.Transfer Amount\r\n"
					+ "	public boolean transferAmount\r\n"
					+ "      13.Add Amount\r\n"
					+ "	public boolean addAmount\r\n"
					+ "      14.Withdraw Amount\r\n"
					+ "	public boolean withdrawAmount\r\n"
					+ "      15.Checking Exists or Not\r\n"
					+ "	public boolean isExists\r\n"
					+ "               \r\n"
					+ "DataStoreMethod.java=>\r\n"
					+ "         1.return id which is generated by database\r\n"
					+ "         2.Employee functions\r\n"
					+ "         3.Customer function    \r\n"
					+ "\r\n"
					+ "com.getSetDetails=>\r\n"
					+ "            1.LoginDetails.java\r\n"
					+ "             (i)- Login loginDetails() throws Exception\r\n"
					+ "            2.RegisterDetails.java\r\n"
					+ "            (i)- Register registerDetails() throws Exception \r\n"
					+ "	   3.ResetDetails\r\n"
					+ "           (i)- Reset resetDetails() throws Exception	\r\n"
					+ "come.model\r\n"
					+ "          1.Login.java----To Login this keyword used\r\n"
					+ "          2.Register.java--To Register private data and getSet method used\r\n"
					+ "          3.Reset.java----To Reset this keyword used ,private data and getSet method used	\r\n"
					+ "\r\n"
					
					+ "https://drive.google.com/file/d/17KEJOiUbf2tZBIQaKl-Vtp4GPMXnUYNl/view?usp=sharing"
					
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "That's all Thanks for reading this whole Information ~(Satyam Umar Vaishya)\r\n"
					+ "                                                     ----------------------\r\n"
					
					+ "");
			break;
//			
//			user.ResetDetails();
//			
//			break;
		case 5:
			System.out.println(" "
					+ "\r\n"
					+ "Know about developers - 'Satyam Umar Vaishya'\r\n"
					+ "\r\n"
					+ "----------------------------------------------------------------------\r\n"
					+ "Satyam Umar Vaishya lives in a small town area  which known as  amargarh.\r\n"
					+ "Which is near to the Allahabad city ,"
					+ "\r\n"
					+ " He completed his graduation in Electrical engineering "
					+ "\r\n"
					+ "from Kalinga Institute of Industrial Technology Odisha Bhubaneswar.\r\n"
					+ "His coding skills are C ,C++,JAVA,SQL,HTML,CSS,JAVASCRIPT.\r\n"
					+ "\r\n"
					+ "Thanks for reading this ~Satyam Umar Vaishya ");
			      break;
//			
////			user.ResetDetails();
//			239340028839
//			
//			break;

		default:
			System.out.println("Thanks For Using my app");
			System.out.println("!!!!!!!!!!!!Visit Again!!!!!!!!!");
			System.exit(0);
			break;
		}

	}

	public static void Menu(String type) {
		Scanner sc1 = new Scanner(System.in);
		MainMenu user = new MainMenu();
		int a = 1;
		
		System.out.println("Welcome to 'Satyam's Banking System (International)'");
		System.out.println("This is The Menu for "+ type);

		while (true) {			

			System.out.println(" 1. For Create an account .");
			System.out.println(" 2. For Login.");
			System.out.println(" 3. For Reset Password.");
  		    System.out.println(" 4. Know more about banking app.");
			System.out.println(" 5. Know about developers - 'Satyam Umar Vaishya'.");
			System.out.println("!!-----Press any other key to exit------!!"
					+ "\r\n");
			System.out.println("Just for advice ---- If you don't have an account please make account else login.----");
			try {
				a = sc1.nextInt();
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			
			
				try {
					user.firstMethod(a, type);
					System.out.println("----------------------");
				} catch (Exception e) {
					System.out.println(e);
//					user.cheakExit();
					System.out.println("Entre the details again");
				}
			
			

			
			System.out.println("work properly! ");

		}

	}

}
