package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

import ar.edu.ort.p1.util.UtilCola;

public class Main {

	public static void main(String[] args) {

		// Creo al ciudadano c1 con sus bienes
		Ciudadano c1 = new Ciudadano(11111111, "Pedro", "Perez");
		c1.agregarBien(new Inmueble(220, "Cabildo 2211", 100000)); // Paga 2000
		c1.agregarBien(new Inmueble(1500, "Solis 768", 800000)); // Paga 16000

		// Creo al ciudadano c2 con sus bienes
		Ciudadano c2 = new Ciudadano(22222222, "Clara", "Martinez");
		c2.agregarBien(new Auto("Ford", "Ecosport", 1600)); // Paga 400
		c2.agregarBien(new Auto("Renault", "Clio", 1200)); // Paga 300
		c2.agregarBien(new Moto("kawasaki", "Z400", 400, Tipo.DEPORTIVA)); // Paga 190

		// Creo al ciudadano c3 con sus bienes
		Ciudadano c3 = new Ciudadano(33333333, "Juan", "Blanco");
		c3.agregarBien(new Arma("SIG Sauer", "P320", 109850)); // Paga 200

		// Creo al ciudadano c4 con sus bienes
		Ciudadano c4 = new Ciudadano(44444444, "Agustina", "Quiroga");
		c4.agregarBien(new Auto("Ford", "Kuga", 2800)); // Paga 700

		// Creo al ciudadano c5 con sus bienes
		Ciudadano c5 = new Ciudadano(55555555, "Maria", "Lladser");
		c5.agregarBien(new Inmueble(1500, "Lugones 4402", 180000)); // Paga 3600

		// Creo al ciudadano c6 con sus bienes, pero no lo agrego
		Ciudadano c6 = new Ciudadano(66666666, "Miguel", "Domiguez");
		c6.agregarBien(new Auto("Peugeot", "307", 2000)); // Paga 500

		// Creo al ciudadano c7 con sus bienes
		Ciudadano c7 = new Ciudadano(77777777, "Marcelo", "Suarez");
		c7.agregarBien(new Arma("Glock", "17", 912389)); // Paga 200
		c7.agregarBien(new Arma("Beretta", "92FS", 234592)); // Paga 200

		/*----------------------------------------------------------------------------*/

		GestorAfip gestorAfip = new GestorAfip();

		// Creo los ciudadanos
		System.out.println("Agrego a los ciudadanos...");
		gestorAfip.agregarCiudadano(c1);
		gestorAfip.agregarCiudadano(c4);
		gestorAfip.agregarCiudadano(c3);
		gestorAfip.agregarCiudadano(c2);
		gestorAfip.agregarCiudadano(c5);
		gestorAfip.agregarCiudadano(c7);

		System.out.println();
		gestorAfip.mostrarCiudadanos();

		// Creo los reclamos
		System.out.println();
		System.out.println("Agrego a los reclamos...");
		gestorAfip.agregarReclamo(new Reclamo(700, 44444444));
		gestorAfip.agregarReclamo(new Reclamo(89, 22222222));
		gestorAfip.agregarReclamo(new Reclamo(200, 33333333));
		gestorAfip.agregarReclamo(new Reclamo(3600, 55555555));
		gestorAfip.agregarReclamo(new Reclamo(1800, 11111111));
		gestorAfip.agregarReclamo(new Reclamo(40, 77777777));
		gestorAfip.agregarReclamo(new Reclamo(50, 66666666));

		// Test ejercicio C
		System.out.println();
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                EVALUACION DE LOS RECLAMOS RECIBIDOS EN EL DIA                |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		ColaDeReclamos colaDeReclamos = gestorAfip.evaluarReclamos();

		System.out.println();
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|               RECLAMOS QUE PROCESARA EL AREA \"RECTIFICACIONES\"               |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		UtilCola.mostrar(colaDeReclamos);
	}
}
