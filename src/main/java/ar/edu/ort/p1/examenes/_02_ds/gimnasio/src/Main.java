package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public class Main {

	public static void main(String[] args) {

		// Creacion de los socios
		Socio socio01 = new Socio(31, 85, false);
		Socio socio02 = new Socio(6, 30, false);
		Socio socio03 = new Socio(7, 40, false);

		// Creacion del gimnasio
		Gimnasio gimnasio = new Gimnasio();

		/*----------------------------------------------------------------------------*/

		// Los socios se anotan en las maquinas
		gimnasio.anotarse(socio01, 1, "mf1"); // OK
		gimnasio.anotarse(socio02, 1, "mf1"); // OK
		gimnasio.anotarse(socio03, 1, "mf1"); // OK

		/*----------------------------------------------------------------------------*/

		SociosPorEdad[][] socios = gimnasio.ingresoPrioritario();

	}

}
