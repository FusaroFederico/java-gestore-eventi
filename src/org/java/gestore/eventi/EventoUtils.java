package org.java.gestore.eventi;

import java.util.GregorianCalendar;
import java.util.List;

public class EventoUtils {
	
	// validatore per la data: se la data è già passata ritorna true, altrimenti false
	public static boolean dataValidator(GregorianCalendar data) {
		GregorianCalendar dataOdierna = new GregorianCalendar();
		if (data.before(dataOdierna)) {
			return true;
		}
		return false;
	}
	
	// validatore per il numero di posti: ritorna false se il numero di postiTotali è minore o uguale a 0
	public static boolean postiTotaleValidator(int postiTotali) {
		if (postiTotali <= 0) {
			return false;
		}
		return true;
	}
	
	// validatore posti disponibili: ritorna true se postiTotali = postiPrenotati, altrimenti false
	public static boolean eventoIsFull(int postiTotali, int postiPrenotati) {
		if (postiTotali == postiPrenotati) {
			return true;
		}
		return false;
	}
	
	//metodo che prende una stringa data(gg/mm/aaaa) e la trasforma in un array di interi
	public static int[] dataToIntArray(String data) {
		String regex = "[/]";
		String[] dataArray = data.split(regex);
		int[] dataArrayInt = new int[3];
		for (int i = 0; i < 3; i++) {
			dataArrayInt[i] = Integer.parseInt(dataArray[i]);
		}
		return dataArrayInt;
	}
	
	// metodo che ordina gli eventi in una List per data
	public static void ordinaPerData(List<Evento> eventi) {
		// uso il metodo sort() che ha bisogno di una funzione di comparazione come parametro
		eventi.sort((e1, e2) -> e1.getData().compareTo(e2.getData()));
	}
}
