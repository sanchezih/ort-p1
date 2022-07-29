package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {

	public static void main(String[] args) {

		SedeDeLicencias sede = new SedeDeLicencias();

		sede.agregarExamen(new ExamenDeAuto("2022-04-10", new Persona("30989001", "Laura", "laura@mail.com"),
				new Circuito(10, 2), new Auto("IHW900", "Fiat", 1400, 5)));

		sede.agregarExamen(new ExamenDeAuto("2022-04-10", new Persona("30989001", "Laura", "laura@mail.com"),
				new Circuito(5, 2), new Auto("IHW900", "Fiat", 1400, 5)));
		sede.agregarExamen(new ExamenDeAuto("2022-04-10", new Persona("30989001", "Laura", "laura@mail.com"),
				new Circuito(100, 1), new Auto("IHW900", "Fiat", 1400, 5)));

		ExamenDeMoto examenMoto01 = new ExamenDeMoto("2022-04-10", new Persona("11111111", "Damian", "damian@mail.com"),
				new Moto("PAS911", "Kawasaki", 250, true));
		examenMoto01.agregarCircuito(new Circuito(120, 1));
		examenMoto01.agregarCircuito(new Circuito(110, 0));
		sede.agregarExamen(examenMoto01);

		System.out.println(sede.obtenerInforme());
	}

}
