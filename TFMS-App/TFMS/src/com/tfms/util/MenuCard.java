package com.tfms.util;

public class MenuCard {
	public static void print()
	{

				char dimond = '\u2666';
				char heart = '\u2665';
				char club = '\u2663';
				char spade = '\u2660';
				char degree = '\u00B0';
				System.out.println("");
				for (int i = 0; i < 50; i++) {
					System.out.print(dimond);
				}
				System.out.println("");
				for (int i = 0; i < 19; i++) {
					System.out.print("-");
				}
				System.out.print(" TFMS" );
				for (int i = 0; i < 20; i++) {
					System.out.print("-");
				}
				System.out.println("");
				for (int i = 0; i < 50; i++) {
					System.out.print(dimond);
				}
				System.out.println("");
				System.out.println("                  Welcome Guest!");
				System.out.println("");
				System.out.println("      Please Choose from below options-");
				System.out.println("");
				System.out.println("      1. Add Batch");
				System.out.println("      2. Update Batch");
				System.out.println("      3. Delete Batch");
				System.out.println("      4. Search Batch");
				System.out.println("");
				System.out.println("      Press (n) to exit...");
				System.out.println("");
				for (int i = 0; i < 50; i++) {
					System.out.print(dimond);
				}
				System.out.println("");
			}
		}


