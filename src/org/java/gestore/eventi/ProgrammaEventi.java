package org.java.gestore.eventi;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ProgrammaEventi {
	// attributi
	private String titolo;
	private List<Evento> eventi;
	
	// costruttore
	public ProgrammaEventi(String titolo) {
		this.titolo = titolo;
		this.eventi = new ArrayList<Evento>();
	}
	
	// metodo che aggiunge un Evento a eventi
	public void aggiungiEvento(Evento evento) {
		this.eventi.add(evento);
	}
	
	// getters and setters
	public String getTitolo() {
		return titolo;
	}

	private void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Evento> getEventi() {
		return eventi;
	}

	private void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
}
