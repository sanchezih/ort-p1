package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public class Main {
	public static void main(String[] args) {

		Vehiculo moto1 = new Moto("m1", 12, false);
		Viaje viaje1 = new Viaje(10, moto1);
		System.out.println("El viaje 1 cuesta: $" + viaje1.getCosto());

		Vehiculo auto1 = new AutoCompacto("ac1", 20, true, TipoCombustible.NAFTA, true);
		Viaje viaje2 = new Viaje(1, auto1);
		System.out.println("El viaje 2 cuesta: $" + viaje2.getCosto());

		Vehiculo auto2 = new AutoPremium("ap1", 80, TipoCombustible.NAFTA, 1);
		Viaje viaje3 = new Viaje(20, auto2);
		System.out.println("El viaje 3 cuesta: $" + viaje3.getCosto());

		Cliente cliente1 = new Cliente(1);
		cliente1.addViaje(viaje1);
		cliente1.addViaje(viaje2);
		cliente1.addViaje(viaje3);

		System.out.println();

		System.out.println("Ejercicio 2: El costo promedio de todos los viajes de cliente 1 es: $"
				+ cliente1.promedioCostoDeViajes());

		System.out.println(
				"Ejercicio 3: El cliente 1 hizo " + cliente1.cantidadViajesPremium() + " viajes con autos premium");

		System.out.println("Ejercicio 4: El cliente 1 hizo " + cliente1.cantidadViajesAutoConAA()
				+ " viajes con autos que tienen AA");

		System.out.println(
				"Ejercicio 5: El cliente 1 realizo al menos un viaje utilizando un vehiculo que utilice combustible del tipo Electrico? "
						+ cliente1.hizoViajeEcologico());

	}
}
