package org.java.gestore.eventi;

import java.util.GregorianCalendar;

public class Evento {
	// variabili di istanza
	private String titolo;
	private GregorianCalendar data;
	private int postiTotale;
	private int postiPrenotati;
	
	// costruttore
	public Evento(String titolo, GregorianCalendar data, int postiTotale) {
		EventoValidUtils.dataValidator(data);
		EventoValidUtils.postiTotaleValidator(postiTotale);
		this.titolo = titolo;
		this.data = data;
		this.postiTotale = postiTotale;
		this.postiPrenotati = 0;
	}
}
