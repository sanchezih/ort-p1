package ar.edu.ort.p1.extra.examenes.empresa_logistica.src;

public class Main {

	public static void main(String[] args) {

		/* Creacion de choferes */
		Chofer choferGeronimo = new Chofer(0001, "Geronimo", 50);
		Chofer choferMaria = new Chofer(0002, "Luciana", 40);
		Chofer choferLuis = new Chofer(0003, "Luis", 45);
		Chofer choferMario = new Chofer(0004, "Mario", 51);

		/* Creacion de camiones */
		Camion camionDeLiquidos01 = new CamionDeLiquidos(965, 2009, 250000, 200, 4);
		Camion camionDeLiquidos02 = new CamionDeLiquidos(222, 2003, 235000, 200, 3);

		Camion camionDeSolidos01 = new CamionDeSolidos(125, 2007, 251000, 3, 1, 5);
		Camion camionDeSolidos02 = new CamionDeSolidos(882, 1999, 219000, 2, 2, 7);

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
		PilaDeDestinos retiroAZarate = new PilaDeDestinos();
		retiroAZarate.push(destinoRetiro);
		retiroAZarate.push(destinoCampana);
		retiroAZarate.push(destinoZarate);

		PilaDeDestinos retiroABaradero = new PilaDeDestinos();
		retiroABaradero.push(destinoRetiro);
		retiroABaradero.push(destinoCampana);
		retiroABaradero.push(destinoZarate);
		retiroABaradero.push(destinoBaradero);

		/* Creacion de viajes */
		Viaje viaje01 = new Viaje(camionDeSolidos01, choferGeronimo, retiroAZarate);
		Viaje viaje02 = new Viaje(camionDeLiquidos01, choferLuis, retiroABaradero);
		Viaje viaje03 = new Viaje(camionDeSolidos01, choferLuis, retiroABaradero);

		/* Creacion de empresa */
		EmpresaLogistica empresa = new EmpresaLogistica();

		empresa.altaDeCamion(camionDeLiquidos01);
		empresa.altaDeCamion(camionDeLiquidos02);
		empresa.altaDeCamion(camionDeSolidos01);
		empresa.altaDeCamion(camionDeSolidos02);

		empresa.altaDeChofer(choferGeronimo);
		empresa.altaDeChofer(choferLuis);
		empresa.altaDeChofer(choferMaria);
		empresa.altaDeChofer(choferMario);

		empresa.agregarViaje(viaje01);
		empresa.agregarViaje(viaje02);
		empresa.agregarViaje(viaje03);

		/*----------------------------------------------------------------------------*/

		// Ejercicio B
		empresa.mostrarCantDeViajesProgramadosQueNoIncluyenAlDestino("Ramallo");

		// Ejercicio C
		empresa.informarDestinosPorCamionChofer();

		// Ejercicio D
		empresa.mostrarCamionesTranspSolidoQueDebanSerRenovados();
	}
}
