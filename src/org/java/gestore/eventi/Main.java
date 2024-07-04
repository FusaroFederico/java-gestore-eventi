package org.java.gestore.eventi;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// istanza di scanner con input da terminale
		Scanner scanner = new Scanner(System.in);
		
		// chiede all'utente se vuole inserire un nuovo evento
		System.out.println("Vuoi inserire un nuovo evento si/no?");
		String sceltaUtente = scanner.nextLine();
		
		// switch
		switch (sceltaUtente) {
		case "si":      // chiede all'utente di inserire degli input per istanziare un nuovo evento
			break;
		case "no":
			System.out.println("Arrivederci.");
			break;
		default:
			System.out.println("Hai inserito un input non corretto.");
		}
		scanner.close();
	}

}
