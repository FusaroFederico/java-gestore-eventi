package org.java.gestore.eventi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Evento {
	// variabili di istanza
	private String titolo;
	private GregorianCalendar data;
	private int postiTotale;
	private int postiPrenotati;
	
	// costruttore
	public Evento(String titolo, GregorianCalendar data, int postiTotale) {
		// controllo data
		if (EventoUtils.dataValidator(data)) {
			throw new IllegalArgumentException("Attenzione! La data inserita è già passata."); 
		}
		// controllo postiTotale
		if (!EventoUtils.postiTotaleValidator(postiTotale)) {
			throw new IllegalArgumentException("Attenzione! Il numero di posti totale deve essere positivo.");
		}
		this.titolo = titolo;
		this.data = data;
		this.postiTotale = postiTotale;
		this.postiPrenotati = 0;
	}

	// Getters and Setters
	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public GregorianCalendar getData() {
		return this.data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public int getPostiTotale() {
		return this.postiTotale;
	}

	private void setPostiTotale(int postiTotale) {
		this.postiTotale = postiTotale;
	}

	public int getPostiPrenotati() {
		return this.postiPrenotati;
	}

	private void setPostiPrenotati(int postiPrenotati) {
		this.postiPrenotati = postiPrenotati;
	}
	
}
