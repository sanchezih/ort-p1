package ar.edu.ort.p1.unidades.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		OrtLand ortLand = new OrtLand();
		
		ortLand.agregarJuego(new Juego());

		// Test ejercicio B
		ArrayList<InformeJuegos> juegosDisponibles = ortLand.obtenerDisponibilidadJuegos();
		System.out.println(juegosDisponibles);

	}

}
