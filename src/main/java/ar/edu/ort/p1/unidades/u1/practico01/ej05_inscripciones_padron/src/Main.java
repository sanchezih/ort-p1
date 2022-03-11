package ar.edu.ort.p1.unidades.u1.practico01.ej05_inscripciones_padron.src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Creo personas
		Persona sabrina = new Persona("30987112", "Sabrina", "Gutierrez", Genero.FEMENINO, null);
		Persona juan = new Persona("32990187", "Juan", "Lopez", Genero.MASCULINO, null);

		// Creo mesas
		Mesa mesa01 = new Mesa(1);
		Mesa mesa02 = new Mesa(2);
		Mesa mesa03 = new Mesa(3);
		Mesa mesa04 = new Mesa(4);

		// Creo escuelas
		Escuela escuela01 = new Escuela("Vicente C. Gallo");
		escuela01.agregarMesa(mesa01);
		escuela01.agregarMesa(mesa02);
		escuela01.agregarMesa(mesa03);
		escuela01.agregarMesa(mesa04);

		mesa04.agregarPersona(juan);

		//escuela01.designarPresidenteDeMesa(mesa04, sabrina);
		ArrayList<PadronMesa> informe = escuela01.obtenerInforme();
		System.out.println(informe);

		System.out.println(mesa04);

		mesa04.toString();
	}

}
