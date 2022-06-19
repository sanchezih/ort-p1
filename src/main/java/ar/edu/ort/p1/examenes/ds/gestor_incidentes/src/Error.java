package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

import java.util.ArrayList;

public abstract class Error extends Ticket {
	private String descripcion;
	private String nombrePersonaQueLoDetecto;
	private ArrayList<String> casosDePrueba;
}
