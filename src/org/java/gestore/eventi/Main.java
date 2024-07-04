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
				
			// chiede all'utente se vuole effettuare prenotazioni
			System.out.println("Vuoi effettuare prenotazioni si/no?");
			String sceltaPrenota = scanner.nextLine();
			
			// se la risposta è si: chiede all'utente quanti posti vuole prenotare
			if (sceltaPrenota.equals("si")) {
				boolean checkInputUtente = false; // variabile boolean di controllo dell'input
				int postiDaPrenotare = 0;
				
				// ciclo while per il controllo dell'input postiDaPrenotare
				while (!checkInputUtente) {
					checkInputUtente = true;
					System.out.println("Quanti posti vuoi prenotare per l'evento?");
					postiDaPrenotare = Integer.parseInt(scanner.nextLine());
					// se inserisce un numero negativo dà un messaggio di errore e chiede
					// nuovamente all'utente quanti posti vuole prenotare
					if (postiDaPrenotare < 0) {
						System.out.println("Attenzione! Hai inserito un numero negativo. Riprova.");
						checkInputUtente = false;
					}
					// se l'input utente eccede il numero di posti totali dà un messaggio
					// di errore e chiede nuovamente di inserire l'input
					if (postiDaPrenotare > evento.getPostiTotale()) {
						System.out.println("Attenzione! L'evento ha al massimo " + evento.getPostiTotale() + " posti prenotabili.");
						checkInputUtente = false;
					}
				}
				// ciclo for che richiama ad ogni iterazione prenota() postiDaPrenotare volte
				for (int i = 1; i <= postiDaPrenotare; i++) {
					evento.prenota();
				}
			}
			// stampa i posti prenotati 
			System.out.println("I posti prenotati sono: " + evento.getPostiPrenotati() + ".");
			// stampa i posti disponibili
			System.out.println("Sono ancora disponibili: " + (evento.getPostiTotale() - evento.getPostiPrenotati()) + " posti.");
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
