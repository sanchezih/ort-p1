package ar.edu.ort.p1.u1.practico01.ej08_ortparking.src;

public class Main {

	public static void main(String[] args) {

		/* Creo las personas */
		Persona maria = new Persona("45321442", "Maria");
		Persona juan = new Persona("12345678", "Juan");
		Persona mariana = new Persona("11342377", "Mariana");

		/* Creo los vehiculos */
		Vehiculo focus = new Vehiculo("LAP004");
		Vehiculo siena = new Vehiculo("EIO521");
		Vehiculo clio = new Vehiculo("KWF303");
		Vehiculo ecosport = new Vehiculo("JEV993");
		Vehiculo twingo = new Vehiculo("OOF125");

		/* Creo los garages */
		Garage saa01 = new Garage("saa01", new Tablero());
		Garage cog01 = new Garage("cog01", new Tablero());

		/*----------------------------------------------------------------------------*/

		OrtParking ortparking = new OrtParking();

		System.out.println("Intento estacionar el vehiculo LAP004... => " + saa01.estacionarVehiculo("LAP004"));

	}

}
