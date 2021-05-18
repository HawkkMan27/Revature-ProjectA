package mMain;

import java.util.Scanner;


public class UnitConverter_Practice {
	
	public static double convertCelsiusToFarenheit(double quantity) {
		double Conversion = (quantity * 9/5) + 32;
		
		return Conversion;
		}
	
	public static double convertCupsToTeaspoons(double quantity) {
		double Conversion = quantity * 48;
	
		return Conversion;
	}
	
	public static double convertMilestoKilometers (double quantity) {
		double Conversion = quantity * 1.609;
	
		return Conversion;
	}
	
	public static double convertUSGallonstoImperialGallons (double quantity) {
		double Conversion = quantity * 0.8327;
	
		return Conversion;
	}
	
	public static boolean checkIfStringNum(String selectNumber) {
		try {
		    int Value = Integer.parseInt(selectNumber);
		    return true;
		} catch (NumberFormatException e) {
		    System.out.println("Input must be a number");
		    
		    return false;
		}
	}
	public static boolean checkIfStringDub(String selectNumber) {
		try {
		    Double Value = Double.parseDouble(selectNumber);
		    return true;
		} catch (NumberFormatException e) {
		    System.out.println("Input must be a number");
		    
		    return false;
		}
	}
	
	public static void selectFromMenu (int selectResponse) {
		switch (selectResponse) {
		case 1: System.out.println("You've chosen : \"" + selectResponse + "\" Which converts Cups into Teaspoons"); 
				break;
		case 2: System.out.println("You've chosen : \"" + selectResponse + "\" Which converts Miles into Kilometers"); 
				break;
		case 3: System.out.println("You've chosen : \"" + selectResponse + "\" Which converts US Gallons into Imperial Gallons"); 
				break;
		case 4: System.out.println("You've chosen : \"" + selectResponse + "\" Which converts Celsius to Farenheit"); 
				break;
		case 5: System.out.println("You have chosen to Quit!");
				break;
		}
	}
	public static void requestUnits (int selectConvert) {
		switch (selectConvert) {
		case 1: System.out.println("How many Cups: ");
			break;
		case 2: System.out.println("How many Miles: ");
			break;
		case 3: System.out.println("How many US Gallons: ");
			break;
		case 4: System.out.println("What's the temperature in Celsius: ");
			break;
		case 5: System.out.println("You have chosen to Quit!");
			break;
	
		}
	}
	
	
	private static double collectQuantity(String unit2) {
	
		Double qty = Double.parseDouble(unit2);
		return qty; 
	}
	
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
		Scanner Unit1 = new Scanner(System.in);
		Scanner selection = new Scanner(System.in);
		Scanner reiterate = new Scanner(System.in);
		
		System.out.println("Welcome to the Unit Converter! Here are your options");
		
		//Displays options to Convert
			
		
		while (menuSelection != 6) {
			
			
			//Displays options on the Console
			System.out.println(" Options to choose from include: ");
			System.out.println("1. Cups to Teaspoons \n" + "2. Miles to Kilometers \n"
			+ "3. Gallons to Imperial Gallons \n" + "4: Celsius to Farenheit\n" + "5.Quit \n" );
			
			
			//Prompts the User to enter a number
			System.out.println("Choose a number from options to Convert Units: ");
			
			String selectNum= selection.nextLine();
			
			//Check if the String has a number
			if (checkIfStringNum(selectNum)== false) { 
			
				selectNum= selection.nextLine();
			}
			
			
			menuSelection = Integer.parseInt(selectNum);
			
			//Check if the number inputed is a menu option
			if (menuSelection >=5 || menuSelection < 0) {
				menuSelection = 0;
				System.out.println("Not a choice in menu: Please choose menu Selection ");
				selectNum= selection.nextLine();
				menuSelection = Integer.parseInt(selectNum);
			}
			
			selectFromMenu (menuSelection);
			
			requestUnits(menuSelection);
			
			String Qty = Unit1.nextLine();
			if (checkIfStringDub(Qty) == false) { 
						Qty = Unit1.nextLine();
			}
			Double newQty = collectQuantity(Qty);
			
			
			
			switch (menuSelection) {
				case 1: 
					
						Double Teaspoons = convertCupsToTeaspoons(newQty);
						System.out.println(Teaspoons + " Teaspoons in " + newQty + " Cup(s)");
						
						break;
					
				case 2: 
					
						Double Kilometers = convertMilestoKilometers(newQty);
						System.out.println("There is Roughly " + Kilometers + " Kilometers in " + newQty + " Mile(s)");
						
					
						break;
				
				case 3: 					
						
						double Imperial = convertUSGallonstoImperialGallons(newQty);
						System.out.println("There is Roughly " + Imperial + " Imperial Gallons in " + newQty + " US Gallon(s)");
						
						break;
					
				case 4: 
						double Farenheit = convertCelsiusToFarenheit(newQty);
						System.out.println("There is Roughly " + Farenheit + " degrees Farenheit for " + newQty + " degrees Celsius");
					    
						break;
						
				case 5:	
						menuSelection = 6;
						break;
		
							}
		
			newQty = 0.0;
			menuSelection = 0;
			System.out.println("Would you like to make another conversion? Enter yes or no");
			
			String inputReit = Unit1.nextLine();
			inputReit = inputReit.toLowerCase();
			System.out.println(inputReit);
			if (inputReit.equals("yes")) {
				menuSelection = 0;
			} 
			else if (inputReit.equals("no")) {
				System.out.println("You have entered no, Goodbye");
				menuSelection = 6;
			} 
				 else {
				System.out.println("Invalid Entry");
				menuSelection = 6;
				
			}
		}
				
			Unit1.close(); 
			selection.close();
			reiterate.close();
				}
						
			}	
		
			
			



