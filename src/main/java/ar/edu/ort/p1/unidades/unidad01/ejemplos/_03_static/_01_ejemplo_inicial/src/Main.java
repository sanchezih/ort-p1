package ar.edu.ort.p1.unidades.unidad01.ejemplos._03_static._01_ejemplo_inicial.src;

public class Main {

	public static void main(String[] args) {

		Automovil a1 = new Automovil("Renault", "CIK882", "Blanco", 19000.0);
		Automovil a2 = new Automovil("Ford", "DBN853", "Rojo", 24000.0);
		Automovil a3 = new Automovil("Rover", "EJW901", "Gris", 32000.0);

		System.out.println(a1.getPrecioPromocional());
		System.out.println(a2.getPrecioPromocional());
		System.out.println(a3.getPrecioPromocional());

		Automovil.anularDescuento();
		System.out.println("\nDescuento anulado\n");

		System.out.println(a1.getPrecioPromocional());
		System.out.println(a2.getPrecioPromocional());
		System.out.println(a3.getPrecioPromocional());

		System.out.println("\nCreo otro auto\n");
		Automovil a4 = new Automovil("Fiat", "CXE882", "Gris", 10000.0);
		System.out.println(a4.getPrecioPromocional());

	}
}
