package ar.edu.ort.p1.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class Participante {

	private String nombre;
	private int edad;
	private ArrayList<Carta> cartasEnMano;

	public Participante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.cartasEnMano = new ArrayList<Carta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void darCarta(Carta c) {
		this.cartasEnMano.add(c);
	}

}
