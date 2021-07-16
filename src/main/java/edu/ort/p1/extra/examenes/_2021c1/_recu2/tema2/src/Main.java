package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class Main {

	public static void main(String[] args) {

		/* Creacion de choferes */
		Chofer choferGeronimo = new Chofer(0001, "Geronimo", 50);
		Chofer choferMaria = new Chofer(0002, "Maria", 40);
		Chofer choferLuis = new Chofer(0003, "Luis", 45);
		Chofer choferMario = new Chofer(0004, "Mario", 51);

		/* Creacion de camiones */
		Camion camionDeLiquidos01 = new CamionDeLiquidos(061, 2009, 250000, 200, 4);
		Camion camionDeLiquidos02 = new CamionDeLiquidos(222, 2003, 235000, 200, 3);

		Camion camionDeSolidos01 = new CamionDeSolidos(125, 2007, 153000, 3, 1, 5);
		Camion camionDeSolidos02 = new CamionDeSolidos(882, 1999, 540000, 2, 2, 1);

		/* Creacion de destinos */
		Destino destinoRetiro = new Destino(1, "Retiro");
		Destino destinoCampana = new Destino(2, "Campana");
		Destino destinoZarate = new Destino(3, "Zarate");
		Destino destinoBaradero = new Destino(4, "Baradero");
		Destino destinoSanPedro = new Destino(5, "San Pedro");
		Destino destinoRamallo = new Destino(6, "Ramallo");
		Destino destinoSanNicolas = new Destino(7, "San Nicolas");
		Destino destinoEmpVillaConstitucion = new Destino(8, "Emp. Villa Constitucion");
		Destino destinoArroyoSeco = new Destino(9, "Arroyo Seco");
		Destino destinoRosarioSur = new Destino(10, "Rosario Sur");
		Destino destinoRosarioNorte = new Destino(11, "Rosario Norte");

		/* Creacion de pilas de destinos */
		PilaDeDestinos pila01 = new PilaDeDestinos();
		pila01.push(destinoRetiro);
		pila01.push(destinoCampana);
		pila01.push(destinoZarate);

		/* Creacion de viajes */
		Viaje viaje01 = new Viaje(camionDeSolidos01, choferGeronimo, pila01);

		/* Creacion de empresa */
		EmpresaLogistica empresaDeLogistica = new EmpresaLogistica();
		
	

		empresaDeLogistica.agregarViaje(viaje01);

		/*----------------------------------------------------------------------------*/

		// Ejercicio B
		empresaDeLogistica.mostrarCantDeViajesProgramadosQueNoIncluyenAlDestino("Baradero");

		// Ejercicio C
		empresaDeLogistica.informarDestinosPorCamionChofer();

		// Ejercicio D
	}
}
