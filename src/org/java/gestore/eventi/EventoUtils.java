package org.java.gestore.eventi;

import java.util.GregorianCalendar;

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
}
