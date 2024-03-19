package ar.edu.ort.p1.unidades.unidad01.practico01.ej05_inscripciones_padron.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.UtilArraylist;

public class Main {

	public static void main(String[] args) {

		// Creo personas
		Persona sabrina = new Persona("30987112", "Sabrina", "Gutierrez", Genero.FEMENINO, null);
		Persona juan = new Persona("32990187", "Juan", "Lopez", Genero.MASCULINO, null);
		Persona fernando = new Persona("29635810", "Fernando", "Ruiz", Genero.MASCULINO, null);
		Persona luisa = new Persona("29635810", "Luisa", "Ruiz", Genero.FEMENINO, null);

		// Creo mesas
		Mesa mesa01 = new Mesa(1);
		Mesa mesa02 = new Mesa(2);
		Mesa mesa03 = new Mesa(3);

		// Creo escuelas
		Escuela escuela01 = new Escuela("Vicente Carmelo Gallo");
		escuela01.agregarMesa(mesa01);
		escuela01.agregarMesa(mesa02);
		escuela01.agregarMesa(mesa03);

		// Agrego personas a las mesas
		mesa01.agregarPersona(sabrina);
		mesa01.agregarPersona(juan);

		// Miro el estado de las mesas
		System.out.println(mesa01.toString());

		// Test ejercicio B
		escuela01.designarPresidenteDeMesa(mesa01, fernando);

		// Miro el estado de las mesas
		System.out.println(mesa01.toString());

		// Test ejercicio C
		UtilArraylist.listarElementos((ArrayList<PadronMesa>) escuela01.obtenerInforme());

	}

}
