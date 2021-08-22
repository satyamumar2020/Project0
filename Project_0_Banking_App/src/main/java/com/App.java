package com;

import com.menu.MainMenu;

public class App {
	
	public static void main(String[] args) {
		String type = null;
		System.out.println("Welocme To banking Operation System");
		MainMenu main = new MainMenu();
		try {
			type = main.cheakType();
			
			main.Menu(type);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



//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












