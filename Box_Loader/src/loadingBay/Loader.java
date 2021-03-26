package loadingBay;

import java.util.Scanner;

//toate la gramada acum
public class Loader {
	
	int valueInBox;
	int transferValue;
	String playerName; // adica Loader-ul
	
	Loader(String pName){
		playerName=pName;
	}
	
	void load(int quant) { //quant e quantity  metoda de pus in cutie		
		if(quant !=0) {
			valueInBox = valueInBox + quant;
			transferValue = quant;
		}		
	}
	
	void unLoad(int quant) {
		if(quant !=0) {
			valueInBox = valueInBox - quant;
			transferValue = -quant;
		}
	}
	
	
	void terminalUI() {  // meniu simplu
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Loading Bay, " + playerName + "!");
		System.out.println();
		System.out.println("Choose an option.");
		System.out.println();
		System.out.println("A. Cargohold status");
		System.out.println("B. Load cargo");
		System.out.println("C. Unload cargo");
		System.out.println("D. Close Terminal");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {			 
			case 'A':            //cargohold status, sa vezi ce ai in hold/cutie
				System.out.println("-----------///-----------");
				System.out.println("Cargohold has " + valueInBox + " worth of value.");
				System.out.println();
				break;
			case 'B': // load in cargo/box
				System.out.println("Please enter loading value: ");
				int quant = scanner.nextInt();
				load(quant);
				System.out.println();
				break;
			case 'C': //unload
				System.out.println("Enter an amount to withdraw: ");
				int quantUnload = scanner.nextInt();
				unLoad(quantUnload);
				System.out.println();
				break;
			case 'D':  //exit
				System.out.println("====================================");
				break;
			default:  // pentru invalid input
				System.out.println("INVALID INPUT BEEP BOOP BEEP!!");
				break;
			}
		} while(option != 'D');
		System.out.println("Thank you using Cargo Terminal(tm)!");
	}
}
