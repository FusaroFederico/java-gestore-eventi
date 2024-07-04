package org.java.gestore.eventi;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Concerto extends Evento {
	// attributi
	private LocalTime ora;
	private double prezzo;
	
	// costruttore
	public Concerto(String titolo, GregorianCalendar data, int postiTotale, LocalTime ora, double prezzo) {
		super(titolo, data, postiTotale);
		this.ora = ora;
		this.prezzo = prezzo;
	}
	
	// metodo che restituisce prezzo formattato
	public String getPrezzoFormattato() {
		return String.format("Prezzo: %.2f €", this.prezzo);
	}
	
	// getters and setters
	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
