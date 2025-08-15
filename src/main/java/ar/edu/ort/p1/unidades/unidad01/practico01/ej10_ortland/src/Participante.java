package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

import java.util.ArrayList;
import java.util.List;

public class Participante {

	private String nombre;
	private int edad;
	private List<Carta> cartasEnMano;

	/*----------------------------------------------------------------------------*/

	public Participante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.cartasEnMano = new ArrayList<Carta>();
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	/*----------------------------------------------------------------------------*/

	public void darCarta(Carta carta) {
		this.cartasEnMano.add(carta);
	}

}
