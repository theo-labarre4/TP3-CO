package main;

import jeux.JeuShifumi;
import prince.PetitPrince0;


public class Run3PetitsPrinces {
	
	private static void scenario0() {
		System.out.println("Creation Petit Princes 0 : \n");
		
		for (int i = 1; i <= 9; i++) {
			new PetitPrince0("Prince"+i);
			System.out.println("Prince"+i);
		}
	}

	private static void scenario1() {
		System.out.println("Creation Petit Princes : \n");
		
		for (int i = 1; i <= 9; i++) {
//			new PetitPrince("PP" + i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("BEGIN : Petit Prince 2 \n");
		
		scenario0();
//		scenario1();
		
		System.out.println("\nEND \n");
	}

}
