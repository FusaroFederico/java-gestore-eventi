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
			// input utente: titolo
			System.out.println("Inserisci il titolo dell'evento:");
			String titolo = scanner.nextLine();
			
			// input utente: data
			System.out.println("Inserisci la data in cui avverrà l'evento nel formato gg/mm/aaaa :");
			String dataUtente = scanner.nextLine();
			// istanza di GregorianCalendar data
			int[] dataArrayInt = EventoUtils.dataToIntArray(dataUtente);
			GregorianCalendar data = new GregorianCalendar(dataArrayInt[2], dataArrayInt[1] - 1, dataArrayInt[0]);
			
			// input utente: posti
			System.out.println("Quanti posti saranno disponibili per l'evento?");
			String posti = scanner.nextLine();
			
			// crea nuovo evento
			Evento evento = new Evento(titolo, data, Integer.parseInt(posti));
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
