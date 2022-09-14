package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {

	public static void main(String[] args) {

		SedeDeLicencias sede = new SedeDeLicencias();

		ExamenDeAuto examenAuto01 = new ExamenDeAuto( //
				"2022-04-10", //
				new Persona("11111111", "Laura", "laura@mail.com"), //
				new Circuito(10, 2), //
				new Auto("IHW900", "Fiat", 1400, 5) //
		);

		/*------------------------------------*/

		ExamenDeAuto examenAuto02 = new ExamenDeAuto( //
				"2022-04-10", //
				new Persona("22222222", "Marcelo", "marcelo@mail.com"), //
				new Circuito(5, 2), //
				new Auto("LFP182", "Renault", 1400, 5) //
		);

		/*------------------------------------*/

		ExamenDeAuto examenAuto03 = new ExamenDeAuto( //
				"2022-04-10", //
				new Persona("33333333", "Victoria", "victoria@mail.com"), //
				new Circuito(100, 1), //
				new Auto("CHC078", "Renault", 1400, 5) //
		);

		/*------------------------------------*/

		ExamenDeMoto examenMoto01 = new ExamenDeMoto( //
				"2022-04-10", //
				new Persona("44444444", "Damian", "damian@mail.com"), //
				new Moto("PAS911", "Kawasaki", 250, true) //
		);
		examenMoto01.agregarCircuito(new Circuito(120, 1));
		examenMoto01.agregarCircuito(new Circuito(110, 0));

		/*------------------------------------*/

		sede.agregarExamen(examenAuto01);
		sede.agregarExamen(examenAuto02);
		sede.agregarExamen(examenAuto03);
		sede.agregarExamen(examenMoto01);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println(sede.obtenerInforme());
	}

}
