package edu.ort.p1.u5.practico05.ej10_elecciones;

public class Mesa {

	private int numero;
	private ListaElectoresAlfabetica electoresAlfa;
	private ListaElectoresPorDNI electoresDni;

	public Mesa(int numero) {
		setNumero(numero);
		electoresAlfa = new ListaElectoresAlfabetica();
		electoresDni = new ListaElectoresPorDNI();
	}

	public void agregarElector(Elector elector) {
		if (elector == null)
			throw new RuntimeException("Debe agregarse un Elector");
		if (electoresDni.exists(elector.getDni()))
			throw new RuntimeException("Elector ya cargado en mesa");
		electoresDni.add(elector);
		electoresAlfa.add(elector);
	}

	public Integer getNumero() {
		return numero;
	}

	public int obtenerNroDeOrden(int dni) {
		int pos = electoresAlfa.size() - 1;
		while (pos > -1 && electoresAlfa.get(pos).getDni() != dni)
			pos--;
		return pos + 1;
	}

	private void setNumero(int numero) {
		if (numero < 1)
			throw new RuntimeException("Numero de mesa ilegal");
		this.numero = numero;
	}

	public boolean tieneEnLista(int dni) {
		return electoresDni.exists(dni);
	}

	public boolean tieneEnLista(String nombreCompleto) {
		return electoresAlfa.exists(nombreCompleto);
	}

	public RegistroDeElector generarRegistroDeElector(int dni) {
		RegistroDeElector registro = null;
		int nroDeOrden = obtenerNroDeOrden(dni);
		if (nroDeOrden > 0) {
			registro = new RegistroDeElector(dni, numero, nroDeOrden);
		}
		return registro;
	}

}