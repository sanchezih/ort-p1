package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Garage saa01 = new Garage("SAA01", new Tablero());
		OrtParking ortParking = new OrtParking();

		ortParking.agregarGarage(saa01);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Intento estacionar el vehiculo LAP004... => " + saa01.estacionarVehiculo("IHW061"));
		System.out.println("Intento estacionar el vehiculo EIO521... => " + saa01.estacionarVehiculo("EIO521"));

		// Test ejercicio C
		List<InformeGarage> res = ortParking.obtenerInformeEstadoGarages();
		
		// Test ejercicio D
		ortParking.mostrarVehiculosSinLlave();
		
		// Test ejercicio E
		saa01.esPersonaAutorizada("30982881");
	}

}
