package ar.edu.ort.p1.unidades.u1.practico01.ej08_ortparking.src;

public class Main {

	public static void main(String[] args) {

		// Creo las personas
		Persona maria = new Persona("45321442", "Maria");
		Persona juan = new Persona("12345678", "Juan");
		Persona mariana = new Persona("11342377", "Mariana");

		// Creo los vehiculos
		Vehiculo focus = new Vehiculo("LAP004");
		Vehiculo siena = new Vehiculo("EIO521");
		Vehiculo clio = new Vehiculo("KWF303");
		Vehiculo ecosport = new Vehiculo("JEV993");
		Vehiculo twingo = new Vehiculo("OOF125");

		// Creo los garages y registro los vehiculos
		Garage saa01 = new Garage("SAA01", new Tablero());
		saa01.registrarVehiculo(focus);
		saa01.registrarVehiculo(clio);
		saa01.registrarVehiculo(ecosport);
		saa01.registrarVehiculo(twingo);

		/*----------------------------------------------------------------------------*/

		OrtParking ortparking = new OrtParking();

		// Test ejercicio B
		System.out.println("Intento estacionar el vehiculo LAP004... => " + saa01.estacionarVehiculo("LAP004"));
		System.out.println("Intento estacionar el vehiculo EIO521... => " + saa01.estacionarVehiculo("EIO521"));

	}

}
