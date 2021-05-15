package mMain;

import java.util.Scanner;


public class UnitConverter_Practice {

	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
		System.out.println("Welcome to the Unit Converter! Here are your options");
		
		//Displays options to Convert
		
			System.out.println(" Options to choose from include: ");
			System.out.println("1. Cups to Teaspoons \n" + "2. Miles to Kilometers \n"
			+ "3. Gallons to Imperial Gallons \n" + "4: Quit\n" );
			//Prompts the User to enter a number
			System.out.println("Choose a number from options to Convert Units: ");
			
			Scanner selection = new Scanner(System.in);
			
			String selectNum= selection.nextLine();
			
			menuSelection = Integer.parseInt(selectNum);
		
		
		while (menuSelection != 5 ) {
			
			
			if (menuSelection <= 5) {
			switch (menuSelection) {
				case 1: System.out.println("You've chosen : \"" + menuSelection + "\" Which converts Cups into Teaspoons"); 
						System.out.println("How many Cups: ");
						Scanner Unit1 = new Scanner(System.in);
						String Amount1 = Unit1.nextLine();
						
						Unit1.close();
						Double notYetConverted1 = Double.parseDouble(Amount1);
						Double Outcome1 = notYetConverted1 * 48;
						System.out.println(Outcome1 + " Teaspoons in " + notYetConverted1 + " Cup(s)");
						
						break;
					
				case 2: System.out.println("You've chosen : \"" + menuSelection + "\" Which converts Miles into Kilometers"); 
						System.out.println("How many Miles: ");
						Scanner Unit2 = new Scanner(System.in);
						String Amount2 = Unit2.nextLine();
						Double notYetConverted2 = Double.parseDouble(Amount2);
						Double Outcome2 = notYetConverted2 * 1.609;
						System.out.println("There is Roughly " + Outcome2 + " Kilometers in " + notYetConverted2 + " Mile(s)");
						
						Unit2.close();
						break;
				
				case 3: System.out.println("You've chosen : \"" + menuSelection + "\" Which converts US Gallons into Imperial Gallons"); 
						System.out.println("How many US Gallons: ");
						Scanner Unit3 = new Scanner(System.in);
						String Amount3 = Unit3.nextLine();
						Double notYetConverted3 = Double.parseDouble(Amount3);
						Double Outcome3 = notYetConverted3 * 0.8327;
						System.out.println("There is Roughly " + Outcome3 + " Imperial Gallons in " + notYetConverted3 + " US Gallon(s)");
						
						Unit3.close();
						break;
					
				case 4: System.out.println("You have chosen Quit! Goodbye");
						break;
		
							}
			
				menuSelection = 5;
			}
			else {
				System.out.println("Not a Valid Entry!! Please enter a number from 1 to 4");
			
			}
			selection.close();
		
		}
		
		
			
	}		
}
