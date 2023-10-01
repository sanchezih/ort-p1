package ar.edu.ort.p1.unidades.u4.practico04.ej04_viajes_tren.src;

public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		// Lista de reservas con las que cuenta la empresa

		// 2 personas recorren 2 estaciones -> 100*2=200
		empresa.agregarReserva(new Reserva("R001", 2, new Recorrido(Estacion.BUENOS_AIRES, Estacion.MERCEDES)));

		// 3 personas recorren 3 estaciones -> 150*3=450
		empresa.agregarReserva(new Reserva("R002", 3, new Recorrido(Estacion.SUIPACHA, Estacion.BUENOS_AIRES)));

		// 1 persona recorren 2 estaciones -> 100*1=100
		empresa.agregarReserva(new Reserva("R003", 1, new Recorrido(Estacion.SUIPACHA, Estacion.ALBERTI)));

		// 2 personas recorren todas las estaciones del recorrido (6). Obtienen 20%
		// desc. -> (300*0.8)*2=480
		empresa.agregarReserva(new Reserva("R004", 2, new Recorrido(Estacion.BRAGADO, Estacion.BUENOS_AIRES)));

		// 4 personas recorren 3 estaciones -> 150*4=600
		empresa.agregarReserva(new Reserva("R005", 4, new Recorrido(Estacion.ALBERTI, Estacion.MERCEDES)));

		// 1 persona recorre todas las estaciones del recorrido (6). Obtiene 20% desc.
		// -> (300*0.8)*1=240
		empresa.agregarReserva(new Reserva("R006", 1, new Recorrido(Estacion.BRAGADO, Estacion.BUENOS_AIRES)));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Ejercicio B");
		System.out.println("La recaudacion total es: " + empresa.recaudacionTotal());

		System.out.println();

		// Test ejercicio C
		// Para probar este metodo, en vez de llamarlo pasandole una estacion por
		// parametro, hago un for que lo llamara n cantidad de veces, donde n es la
		// cantidad de elementos en el enum.

		System.out.println("Ejercicio C");
		for (int i = 0; i < Estacion.values().length; i++) {
			Estacion estacion = Estacion.values()[i];
			System.out.println(
					"Por la estacion " + estacion + " pasaran " + empresa.cantVecesRecorrida(estacion) + " personas");
		}

	}

}
