package edu.ort.p1.u5.practico05.ej10_elecciones.src;

public class Main {

	static MesaElectoral mesaElectoral;
	static PadronElectoral padron;

	public static void main(String[] args) {
		mesaElectoral = new MesaElectoral();

		registrarElector(12345678, "Alvarez", "Alvaro", 1001);
		registrarElector(12345678, "Alvarez", "Alvaro", 1001);
		registrarElector(22222231, "Ahab", "Capitan", 1001);
		registrarElector(4635281, "Einstein", "Alberto", 1005);

		padron = mesaElectoral.generarPadron();

		consultarMesaDeElectorPorDNI(12345678);
		consultarMesaDeElectorPorDNI(22222231);
		consultarMesaDeElectorPorDNI(4635281);
		consultarMesaDeElectorPorDNI(1245);
	}

	private static void registrarElector(int dni, String apellido, String nombre, int mesa) {
		System.out.println("Registrando elector en Mesa Electoral");
		System.out.println("Apellido: " + apellido);
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Mesa: " + mesa);
		try {
			mesaElectoral.agregarElector(dni, apellido, nombre, mesa);
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
	}

	private static void consultarMesaDeElectorPorDNI(int dniElector) {
		RegistroDeElector mesa = padron.generarRegistroDeElector(dniElector);
		if (mesa == null) {
			System.out.printf("El DNI %d no figura en el padron\n", dniElector);
		} else {
			System.out.printf("DNI %d - %s\n", dniElector, mesa);

		}
	}

}