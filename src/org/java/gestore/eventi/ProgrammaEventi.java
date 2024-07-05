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
	
	// metodo che restituisce una lista con gli eventi in una certa data
	public List<Evento> getEventiInData(GregorianCalendar data){
		ArrayList<Evento> eventiInData = new ArrayList<Evento>();
		// for che scorre gli eventi nell'arrayList eventi
		for(int index = 0; index < eventi.size(); index++) {
			// se la data dell'evento è uguale al parametro data
			// mette l'evento in eventiInData
			if (eventi.get(index).getData().equals(data)) {
				eventiInData.add(eventi.get(index));
			}
		}
		return eventiInData;
	}
	
	// metodo che restituisce quanti eventi ci sono nel programma
	public int numeroEventiInProgramma() {
		Object[] eventiArray = this.eventi.toArray();
		return eventiArray.length;
	}
	
	// metodo che svuota la List<Evento> eventi
	public void svuotaProgrammaEventi() {
		this.eventi.clear();
	}
	
	// Override del metodo toString() che restituisce una stringa che mostra il titolo del programma e 
	// tutti gli eventi ordinati per data nella forma: 
	// data - titolo
	@Override
	public String toString() {
		EventoUtils.ordinaPerData(eventi);
		String listaEventi = "";
		for (int i = 0; i < eventi.size(); i++) {
			String listaEventiAgg = listaEventi + "\n" + eventi.get(i).toString();
			listaEventi = listaEventiAgg;
		}
		
		return this.titolo + "\n" + listaEventi;
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
