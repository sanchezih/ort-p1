package ar.edu.ort.p1.extra.examenes.gestion_tickets_v1.src;

import java.util.ArrayList;

public abstract class Error extends Tarea {
	private String ambiente;
	private ArrayList<String> casosDePrueba;
	public Error(String ambiente, ArrayList<String> casosDePrueba) {
		super();
		this.ambiente = ambiente;
		this.casosDePrueba = casosDePrueba;
	}

	

}
