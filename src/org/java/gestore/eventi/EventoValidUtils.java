package org.java.gestore.eventi;

import java.util.GregorianCalendar;

public class EventoValidUtils {
	
	// validatore per la data: se la data è già passata dà un messaggio di errore
	public static boolean dataValidator(GregorianCalendar data) {
		GregorianCalendar dataOdierna = new GregorianCalendar();
		if (data.before(dataOdierna)) {
			System.out.println("Attento! La data che hai inserito è già passata.");
			return false;
		}
		return true;
	}
	
	// validatore per il numero di posti
	public static boolean postiTotaleValidator(int postiTotali) {
		if (postiTotali < 0) {
			System.out.println("Attento! Il numero di posti totale deve essere positivo.");
			return false;
		}
		return true;
	}
}
