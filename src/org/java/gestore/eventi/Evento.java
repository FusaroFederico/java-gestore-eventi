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
