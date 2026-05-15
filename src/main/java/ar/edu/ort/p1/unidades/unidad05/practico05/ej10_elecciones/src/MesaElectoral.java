package ar.edu.ort.p1.unidades.unidad05.practico05.ej10_elecciones.src;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej10_elecciones.src.listasordenadas.ListaElectoresPorDNI;

public class MesaElectoral {

	private ListaElectoresPorDNI electores;

	public MesaElectoral() {
		electores = new ListaElectoresPorDNI();
	}

	public void agregarElector(int dni, String apellido, String nombre, int mesa) {
		if (electores.exists(dni))
			throw new RuntimeException("Elector ya registrado");
		electores.add(new ElectorConMesa(dni, apellido, nombre, mesa));
	}

	public PadronElectoral generarPadron() {
		PadronElectoral padron = new PadronElectoral();
		for (Elector elector : electores) {
			padron.registrarEnMesa((ElectorConMesa) elector);
		}
		return padron;
	}

}
